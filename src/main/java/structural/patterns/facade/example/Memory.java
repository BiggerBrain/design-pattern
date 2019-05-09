package structural.patterns.facade.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Memory {
    public void startup() {
        log.info("Memory start!");
    }

    public void shutdown() {
        log.info("Memory closed!");
    }
}
