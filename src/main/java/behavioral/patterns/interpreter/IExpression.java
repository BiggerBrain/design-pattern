/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.interpreter;

/**
 * @author lishixiong
 * @version 1.0: IExpression.java, v 0.1 2019年05月06日 22:16 lishixiong Exp $
 */
public interface IExpression {
    void interpret(Context context);
}