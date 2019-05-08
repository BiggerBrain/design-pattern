package structural.patterns.facade.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/11.
 */
@Log4j2
public class Disk {
    public void startup() {
        log.info("Disk start!");
    }

    public void shutdown() {
        log.info("Disk closed!");
    }
}
