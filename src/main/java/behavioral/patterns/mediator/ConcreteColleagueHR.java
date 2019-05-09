
package behavioral.patterns.mediator;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteColleagueHR.java, v 0.1 2019年05月08日 15:59 lishixiong Exp $
 */
@Log4j2
public class ConcreteColleagueHR extends Colleague {
    public ConcreteColleagueHR(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String msg) {
        log.info(name + "收到消息:" + msg);
    }
}
