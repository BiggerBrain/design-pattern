
package behavioral.patterns.mediator;

import lombok.Data;

/**
 * @author lishixiong
 * @version 1.0: ConcreteMediator.java, v 0.1 2019年05月08日 16:01 lishixiong Exp $
 */
@Data
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueHR hr;
    private ConcreteColleagueRD rd;
    @Override
    public void constact(String message, Colleague colleague) {
        if (colleague == hr) {
            rd.getMessage(message);
        }
        else {
            hr.getMessage(message);
        }
    }
}