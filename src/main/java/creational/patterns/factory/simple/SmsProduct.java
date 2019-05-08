package creational.patterns.factory.simple;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteProduct.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $ 短信产品
 */
@Log4j2
public class SmsProduct implements IProduct {
    @Override
    public void use() {
        log.info("短信产品");
    }
}
