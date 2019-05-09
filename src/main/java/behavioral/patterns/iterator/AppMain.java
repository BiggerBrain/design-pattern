
package behavioral.patterns.iterator;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 22:36 lishixiong Exp $
 * 迭代器模式3步走：
 * 1.聚集类的设计（pojo的列表类）
 * 2.迭代器设计（抽象迭代器和具体迭代器的设计）
 * 3.聚集类接入迭代器
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        Products products = new Products(3);
        products.addProduct(new Product("1", "sms", "1"));
        products.addProduct(new Product("2", "mail", "1"));
        products.addProduct(new Product("3", "qq", "1"));

        for (Iterator iter = products.iterator(); iter.hasNext(); ) {
            Product name = (Product) iter.next();
            log.info("Name : " + name.toString());
        }
    }
}