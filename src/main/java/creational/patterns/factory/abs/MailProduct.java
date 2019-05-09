
package creational.patterns.factory.abs;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: MailProduct.java, v 0.1 2019年05月01日 15:01 lishixiong Exp $
 */
@Log4j2
public class MailProduct implements IMailProduct {
    @Override
    public void use() {
        log.info("邮箱产品");
    }
}