package creational.patterns.single.dbl.sync.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {
    }

    public static SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            // 这是类锁，在对象中只有一份
            synchronized (SynchronizedSingleton.class) {
                if (synchronizedSingleton == null) {
                    synchronizedSingleton = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingleton;
    }

    public void say() {
        log.info("i'm SynchronizedSingleton!!!");
    }
}
