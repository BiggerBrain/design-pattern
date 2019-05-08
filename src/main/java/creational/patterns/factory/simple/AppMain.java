package creational.patterns.factory.simple;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $ 简单工厂模式，程序入口
 */
public class AppMain {
    public static void main(String[] args) {
        IProduct product = Fatory.createProduct(ProductEnum.SMS);
        product.use();

    }
}
