
package structural.patterns.filter;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 15:32 lishixiong Exp $
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("1", "移动通信", "sms"));
        productList.add(new Product("2", "联通通信", "sms"));
        productList.add(new Product("3", "qq邮箱", "mail"));
        productList.add(new Product("4", "163邮箱", "mail"));
        IFilter smsFilter = new SmsFilter();
        IFilter mailFilter = new MailFilter();
        List<Product> smsProducts = smsFilter.filter(productList);
        for (Product smsProduct :
                smsProducts) {
            log.info(smsProduct.toString());
        }
        List<Product> mailProducts = mailFilter.filter(productList);
        for (Product mailProduct :
                mailProducts) {
            log.info(mailProduct.toString());
        }
    }
}