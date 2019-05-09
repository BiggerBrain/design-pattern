package creational.patterns.single;

import creational.patterns.single.dbl.sync.singleton.SynchronizedSingleton;
import creational.patterns.single.full.singleton.FullSingleton;
import creational.patterns.single.hunger.singleton.HungerSingleton;
import creational.patterns.single.inner.cls.singleton.InnerSingleton;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lishixiong
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        FullSingleton fullSingleton = FullSingleton.getInstance();
        fullSingleton.say();
        InnerSingleton innerSingleton = InnerSingleton.getInstance();
        innerSingleton.say();
        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        hungerSingleton.say();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        synchronizedSingleton.say();

        log.info("------------------------------");
        log.info("------------------------------");
        log.info("------------------------------");

        // 开始用线程池模拟单例模式是否产生真正的单例，比较hashcode值就ok

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        InnerSingleton innerSingleton = InnerSingleton.getInstance();
                        //  innerSingleton.say();
                        log.info(innerSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        FullSingleton fullSingleton = FullSingleton.getInstance();
                        // fullSingleton.say();
                        log.info(fullSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                        // hungerSingleton.say();
                        log.info(hungerSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        log.info("------------------------------");
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
                        //synchronizedSingleton.say();
                        log.info(synchronizedSingleton.hashCode());
                        // log.info("Accessing: " + NO);
                        //模拟实际业务逻辑
                        Thread.sleep((long) (Math.random() * 10));

                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }

    }
}
