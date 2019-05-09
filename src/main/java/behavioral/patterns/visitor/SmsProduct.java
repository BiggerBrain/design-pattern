
package behavioral.patterns.visitor;

/**
 * @author lishixiong
 * @version 1.0: SmsProduct.java, v 0.1 2019年05月09日 20:01 lishixiong Exp $
 */

public class SmsProduct extends Product {
    public SmsProduct(String name, String type) {
        super(name, type);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.accept(this);
    }
}