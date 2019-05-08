package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MailProduct extends IProduct {
    public MailProduct() {
        log.info("开始建造sms对象");
    }
}
