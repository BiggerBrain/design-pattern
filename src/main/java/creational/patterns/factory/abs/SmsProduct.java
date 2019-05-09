
package creational.patterns.factory.abs;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteProduct.java, v 0.1 2019年05月01日 15:00 lishixiong Exp $
 */
@Log4j2
public class SmsProduct implements ISmsProduct {
    @Override
    public void use() {
        log.info("短信产品");
    }
}