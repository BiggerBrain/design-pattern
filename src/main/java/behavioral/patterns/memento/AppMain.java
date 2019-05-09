
package behavioral.patterns.memento;

/**
 *
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月08日 17:40 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("开始");
        careTaker.save(originator.save());
        originator.setState("运行");
        careTaker.read();
    }
}