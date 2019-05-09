
package behavioral.patterns.visitor;

import java.util.List;

/**
 *
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月09日 20:11 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        SmsVisitor visitor = new SmsVisitor();
        List<Product> productList = ObjectStruture.getList();
        for (Product product : productList) {
            product.accept(visitor);
        }
    }
}