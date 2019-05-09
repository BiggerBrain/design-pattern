package behavioral.patterns.command.example.entity;

import lombok.extern.log4j.Log4j2;

/**
 * 电灯
 *
 * @author lishixiong
 */
@Log4j2
public class Light {
    public void on() {
        log.info("Light on!!!");
    }

    public void off() {
        log.info("Light off!!!");
    }
}
