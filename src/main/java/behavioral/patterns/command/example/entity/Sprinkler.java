package behavioral.patterns.command.example.entity;

import lombok.extern.log4j.Log4j2;

/**
 * 浴室水龙头
 *
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class Sprinkler {
    public void waterOn() {
        log.info("Sprinkler waterOn");
    }

    public void waterOff() {
        log.info("Sprinkler waterOff");
    }
}
