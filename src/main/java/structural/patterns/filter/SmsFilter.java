
package structural.patterns.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: SmsFilter.java, v 0.1 2019年05月06日 15:26 lishixiong Exp $
 */
public class SmsFilter implements IFilter {
    @Override
    public List<Product> filter(List<Product> productList) {
        List<Product> products = new ArrayList<>();
        if (null == productList || productList.isEmpty()) { return products; }
        for (Product product : productList) {
            if (product.getType().equalsIgnoreCase("sms")) {
                products.add(product);
            }
        }
        return products;
    }
}