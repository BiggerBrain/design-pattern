
package behavioral.patterns.interpreter;

/**
 * @author lishixiong
 * @version 1.0: IExpression.java, v 0.1 2019年05月06日 22:16 lishixiong Exp $
 * 抽象表达式
 */
public interface IExpression {
    int interpret(Context context);
}