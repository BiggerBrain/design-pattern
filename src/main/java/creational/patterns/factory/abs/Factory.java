
package creational.patterns.factory.abs;

/**
 * @author lishixiong
 * @version 1.0: Factory.java, v 0.1 2019年05月01日 15:04 lishixiong Exp $
 */
public class Factory implements IFactory {
    @Override
    public ISmsProduct createProduct1() {
        return new SmsProduct();
    }

    @Override
    public IMailProduct createProduct2() {
        return new MailProduct();
    }
}