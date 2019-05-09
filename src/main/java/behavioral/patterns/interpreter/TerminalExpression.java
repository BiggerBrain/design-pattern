
package behavioral.patterns.interpreter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: TerminalExpression.java, v 0.1 2019年05月06日 22:21 lishixiong Exp $
 * 下面是样例代码
 */
@Log4j2
public class TerminalExpression implements IExpression {
    @Override
    public int interpret(Context context) {
        log.info("TerminalExpression interpreter ...");
        return 0;
    }
}
//具体终结符表达式(Terminal Expression)
class Constant implements IExpression {
    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context context) {
        return i;
    }
}

class Variable implements IExpression {
    @Override
    public int interpret(Context context) {
        return context.LookupValue(this);
    }
}
