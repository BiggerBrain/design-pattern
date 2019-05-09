/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.templet;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author lishixiong
 * @version 1.0: ConcreteClassA.java, v 0.1 2019年05月08日 17:10 lishixiong Exp $
 */
@Log4j2
public class ConcreteClassA extends AbstractClass {
    protected void doOtherOperation() {
        log.info("具体类A方法执行,doOtherOperation()");
    }
    protected void doSomeOperation() {
        //业务逻辑处理
        log.info("具体类A方法执行,doSomeOperation()");
    }
}