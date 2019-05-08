/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.mediator;

/**
 * @author lishixiong
 * @version 1.0: ConcreteMediator.java, v 0.1 2019年05月08日 16:01 lishixiong Exp $
 */
public class ConcreteMediator extends AbstractMediator {

    @Override
    public void doSomething1() {
        //调用同事类的方法，只要是public的方法都可以调用。
        //super.c1.depMethod();
        //  super.c2.depMethod();
    }

    @Override
    public void doSomething2() {
        // super.c1.selfMethod();
        // super.c2.selfMethod();
    }
}