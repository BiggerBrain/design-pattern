
package behavioral.patterns.empty;

/**
 * @author lishixiong
 * @version 1.0: NullProduct.java, v 0.1 2019年05月07日 10:36 lishixiong Exp $
 */
public class NullProduct extends AbstractProduct {
    @Override
    public String getName() {
        return "null";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}