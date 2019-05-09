
package structural.patterns.decorate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Decorator.java, v 0.1 2019年05月06日 17:59 lishixiong Exp $
 * 装饰器角色
 */
@Log4j2
@AllArgsConstructor
@NoArgsConstructor
public class Decorator implements IComponent {
    private IComponent component;

    @Override
    public void opreation() {
        //委托给构件
        component.opreation();
    }
}