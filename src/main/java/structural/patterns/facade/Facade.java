
package structural.patterns.facade;

/**
 * @author lishixiong
 * @version 1.0: Facade.java, v 0.1 2019年05月06日 18:19 lishixiong Exp $
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void Method() {
        subSystemA.operation();
        subSystemB.operation();
    }
}