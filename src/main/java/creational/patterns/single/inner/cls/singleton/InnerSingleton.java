package creational.patterns.single.inner.cls.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return singleton.single;
    }

    public void say() {
        log.info("i'm InnerSingleton!!!");
    }

    private static class singleton {
        private static InnerSingleton single = new InnerSingleton();
    }
}
