
package behavioral.patterns.strategy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteStrategyB.java, v 0.1 2019年05月07日 10:12 lishixiong Exp $
 */
@Log4j2
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyInterface() {
        log.info("策略B");
    }
}