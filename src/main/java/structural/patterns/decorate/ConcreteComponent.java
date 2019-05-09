
package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteComponent.java, v 0.1 2019年05月06日 17:57 lishixiong Exp $
 * 具体构件角色
 */
@Log4j2
public class ConcreteComponent implements IComponent {
    @Override
    public void opreation() {
        log.info("操作方法");
    }
}