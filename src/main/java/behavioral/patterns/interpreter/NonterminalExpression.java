
package behavioral.patterns.interpreter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: NonterminalIExpression.java, v 0.1 2019年05月06日 22:22 lishixiong Exp $
 * 下面是样例代码
 */
@Log4j2
public class NonterminalExpression implements IExpression {
    private TerminalExpression terminalIExpressionA, terminalIExpressionB;

    public NonterminalExpression(TerminalExpression terminalIExpressionA, TerminalExpression terminalIExpressionB) {
        this.terminalIExpressionA = terminalIExpressionA;
        this.terminalIExpressionB = terminalIExpressionB;
    }

    @Override
    public int interpret(Context context) {
        terminalIExpressionA.interpret(context);
        terminalIExpressionB.interpret(context);
        log.info("interpreter terminalIExpressionA AND  terminalIExpressionB ...");
        return 0;
    }
}
//非终结符表达式(Nonterminal IExpression)
class Add implements IExpression {
    private IExpression left, right;

    public Add(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

class Sub implements IExpression {
    private IExpression left, right;

    public Sub(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}

class Mul implements IExpression {
    private IExpression left, right;

    public Mul(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

class Div implements IExpression {
    private IExpression left, right;

    public Div(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}
