
package behavioral.patterns.templet;

/**
 *
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月08日 17:12 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassA.templateMethod();
        concreteClassB.templateMethod();
    }
}