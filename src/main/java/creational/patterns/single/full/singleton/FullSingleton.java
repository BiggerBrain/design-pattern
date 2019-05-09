package creational.patterns.single.full.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class FullSingleton {
    private static FullSingleton fullSingleton;

    private FullSingleton() {
    }

    public static FullSingleton getInstance() {
        if (fullSingleton == null) {
            fullSingleton = new FullSingleton();
        }
        return fullSingleton;
    }

    public void say() {
        log.info("i'm fullSingleton!!!");
    }
}
