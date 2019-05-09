
package behavioral.patterns.visitor;

/**
 * @author lishixiong
 * @version 1.0: Product.java, v 0.1 2019年05月09日 19:57 lishixiong Exp $
 */

public abstract class Product {
    protected String name;
    protected String type;

    public Product(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public abstract void accept(IVisitor visitor);
}