
package creational.patterns.prototype;

import lombok.Data;

/**
 * @author lishixiong
 * @version 1.0: ProductPrototype.java, v 0.1 2019年05月06日 11:16 lishixiong Exp $
 */
@Data
public abstract class ProductPrototype implements Cloneable {
    protected String id;
    protected String type;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}