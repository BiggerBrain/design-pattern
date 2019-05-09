
package behavioral.patterns.empty;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月07日 10:39 lishixiong Exp $
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        AbstractProduct smsProduct = ProductFactory.getProduct("sms");
        //log.info(smsProduct.name);
        log.info(smsProduct.getName());
        AbstractProduct product = ProductFactory.getProduct("product");
        log.info(product.getName());
    }
}