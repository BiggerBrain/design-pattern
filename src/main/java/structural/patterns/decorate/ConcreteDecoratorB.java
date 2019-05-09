
package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteDecoratorB.java, v 0.1 2019年05月06日 18:03 lishixiong Exp $
 */
@Log4j2
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public void opreation() {
        super.opreation();
        //具体的业务逻辑
        log.info("装饰器B执行装饰任务");
    }
}

