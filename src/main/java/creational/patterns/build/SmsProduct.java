package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class SmsProduct extends IProduct {
    public SmsProduct() {
        log.info("开始建造sms对象");
    }
}
