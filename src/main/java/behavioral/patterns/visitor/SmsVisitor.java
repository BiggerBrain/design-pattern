
package behavioral.patterns.visitor;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: SmsVisitor.java, v 0.1 2019年05月09日 20:03 lishixiong Exp $
 */
@Log4j2
public class SmsVisitor implements IVisitor {
    @Override
    public void accept(SmsProduct smsProduct) {
        log.info("访问Sms产品:" + smsProduct.name);
    }

    @Override
    public void accept(MailProduct mailProduct) {
        log.info("过滤mail产品:" + mailProduct.name);
    }
}