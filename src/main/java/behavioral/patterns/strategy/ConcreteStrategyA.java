
package behavioral.patterns.strategy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteStrategyA.java, v 0.1 2019年05月07日 10:11 lishixiong Exp $
 */
@Log4j2
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyInterface() {
        log.info("策略A");
    }

}