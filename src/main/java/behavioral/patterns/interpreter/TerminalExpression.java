/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.interpreter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: TerminalExpression.java, v 0.1 2019年05月06日 22:21 lishixiong Exp $
 */
@Log4j2
public class TerminalExpression implements IExpression {
    @Override
    public void interpret(Context context) {
        log.info("TerminalExpression interpreter ...");

    }
}