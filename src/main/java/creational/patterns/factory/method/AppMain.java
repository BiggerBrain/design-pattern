package creational.patterns.factory.method;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $ 工厂方法模式，程序入口
 */
public class AppMain {
    public static void main(String[] args) {
        IFactory factory = new SmsFactory();
        factory.createProduct().use();
        factory = new MailFactory();
        factory.createProduct().use();
    }
}
