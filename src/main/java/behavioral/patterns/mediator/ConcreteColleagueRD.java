/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.mediator;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteColleagueRD.java, v 0.1 2019年05月08日 15:59 lishixiong Exp $
 */
@Log4j2
public class ConcreteColleagueRD extends Colleague {
    public ConcreteColleagueRD(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String msg) {
        log.info(name+":"+msg);
    }
}