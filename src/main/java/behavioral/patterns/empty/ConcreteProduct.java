
package behavioral.patterns.empty;

import lombok.ToString;

/**
 * @author lishixiong
 * @version 1.0: ConcreteProduct.java, v 0.1 2019年05月07日 10:35 lishixiong Exp $
 */
@ToString
public class ConcreteProduct extends AbstractProduct {
    public ConcreteProduct(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}