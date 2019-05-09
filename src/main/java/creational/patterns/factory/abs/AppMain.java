
package creational.patterns.factory.abs;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月01日 14:54 lishixiong Exp $
 * 抽象工厂模式，包名不能命名为abstract，所以命名为abs
 */
public class AppMain {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().use();
        factory.createProduct2().use();
    }
}