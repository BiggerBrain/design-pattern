/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.mediator;

import lombok.Data;

/**
 * @author lishixiong
 * @version 1.0: AbstractMediator.java, v 0.1 2019年05月08日 15:55 lishixiong Exp $
 */
@Data
public abstract class AbstractMediator {
    //定义同事类
    protected ColleagueA colleagueA;
    protected ColleagueB colleagueB;

    //中介者需要去完成的方法。
    public abstract void doSomething1();

    public abstract void doSomething2();
}