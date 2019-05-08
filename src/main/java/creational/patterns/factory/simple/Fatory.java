package creational.patterns.factory.simple;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Fatory.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $ 工厂类设计
 */
@Log4j2
public class Fatory {
    public static IProduct createProduct(ProductEnum type) {
        switch (type) {
            case SMS:
                return new SmsProduct();
            case MAIL:
                return new MailProduct();
            default:
                return null;
        }
    }

}
