
package structural.patterns.flyweight;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 18:34 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        IFlyweight fly = factory.factory("sms");
        fly.operation("开始状态");

        fly = factory.factory("mail");
        fly.operation("开始状态");

        fly = factory.factory("sms");
        fly.operation("运行状态");
    }
}