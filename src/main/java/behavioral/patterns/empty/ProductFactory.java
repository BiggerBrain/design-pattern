
package behavioral.patterns.empty;

/**
 * @author lishixiong
 * @version 1.0: ProductFactory.java, v 0.1 2019年05月07日 10:37 lishixiong Exp $
 */
public class ProductFactory {
    public static final String[] names = {"sms", "mail"};

    public static AbstractProduct getProduct(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new ConcreteProduct(name);
            }
        }
        return new NullProduct();
    }
}