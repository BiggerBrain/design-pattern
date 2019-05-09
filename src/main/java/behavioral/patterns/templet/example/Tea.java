package behavioral.patterns.templet.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Tea extends CafeTeeBeverage {
    @Override
    void brew() {
        log.info("drop tea");
    }

    @Override
    void addCondiments() {
        log.info("add lemon");
    }
}
