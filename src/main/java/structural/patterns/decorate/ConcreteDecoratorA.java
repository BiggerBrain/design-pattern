
package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteDecoratorA.java, v 0.1 2019年05月06日 18:01 lishixiong Exp $
 */
@Log4j2
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(IComponent component) {
        super(component);
    }

    @Override
    public void opreation() {
        super.opreation();
        log.info("装饰器A执行装饰任务");
    }
}