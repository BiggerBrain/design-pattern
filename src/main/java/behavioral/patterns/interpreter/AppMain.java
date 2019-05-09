
package behavioral.patterns.interpreter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月08日 15:38 lishixiong Exp $
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(15000);

        context.addValue(a, 14);
        context.addValue(b, 10000);

        IExpression expression = new Div(new Mul(a, b), new Add(new Sub(a, b), c));
        log.info("Result = "+expression.interpret(context));
    }
}