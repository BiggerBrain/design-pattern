
package behavioral.patterns.strategy;

import lombok.Data;

/**
 * @author lishixiong
 * @version 1.0: Context.java, v 0.1 2019年05月07日 10:08 lishixiong Exp $
 */
@Data
public class Context {
    //持有一个具体策略的对象
    private Strategy strategy;

    /**
     * 构造函数，传入一个具体策略对象
     *
     * @param strategy 具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface() {

        strategy.strategyInterface();
    }

}