
package creational.patterns.factory.method;

/**
 * @author lishixiong
 * @version 1.0: SmsFactory.java, v 0.1 2019年04月30日 17:15 lishixiong Exp $
 */
public class SmsFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new SmsProduct();
    }
}