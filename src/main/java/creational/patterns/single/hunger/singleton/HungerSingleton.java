package creational.patterns.single.hunger.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }

    public void say() {
        log.info("i'm HungerSingleton!!!");
    }
}
