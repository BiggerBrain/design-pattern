/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.interpreter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: NonterminalExpression.java, v 0.1 2019年05月06日 22:22 lishixiong Exp $
 */
@Log4j2
public class NonterminalExpression implements IExpression {
    private TerminalExpression terminalExpressionA, terminalExpressionB;

    public NonterminalExpression(TerminalExpression terminalExpressionA, TerminalExpression terminalExpressionB) {
        this.terminalExpressionA = terminalExpressionA;
        this.terminalExpressionB = terminalExpressionB;
    }

    @Override
    public void interpret(Context context) {
        terminalExpressionA.interpret(context);
        terminalExpressionB.interpret(context);
        log.info("interpreter terminalExpressionA AND  terminalExpressionB ...");
    }
}