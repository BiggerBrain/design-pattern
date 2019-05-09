
package creational.patterns.factory.method;

/**
 * @author lishixiong
 * @version 1.0: MailFactory.java, v 0.1 2019年04月30日 17:14 lishixiong Exp $
 */
public class MailFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new MailProduct();
    }
}