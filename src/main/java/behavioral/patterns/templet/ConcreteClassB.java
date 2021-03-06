
package behavioral.patterns.templet;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author lishixiong
 * @version 1.0: ConcreteClassB.java, v 0.1 2019年05月08日 17:11 lishixiong Exp $
 */
@Log4j2
public class ConcreteClassB  extends AbstractClass {
    protected void doOtherOperation() {
        log.info("具体类B方法执行,doOtherOperation()");
    }
    protected void doSomeOperation() {
        //业务逻辑处理
        log.info("具体类B方法执行,doSomeOperation()");
    }
}