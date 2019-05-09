/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.templet;

/**
 * @author lishixiong
 * @version 1.0: AbstractClass.java, v 0.1 2019年05月08日 16:35 lishixiong Exp $
 * 模板抽象类
 */
public abstract class AbstractClass {
    protected abstract void doSomeOperation();

    protected abstract void doOtherOperation();

    public void templateMethod() {
        this.doOtherOperation();
        this.doSomeOperation();
    }
}