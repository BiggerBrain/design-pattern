package structural.patterns.bridge;

/**
 * @author lishixiong
 */
public class AppMain {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);

        Implementor implementor1 = new ConcreteImplementorB();
        RefinedAbstraction abstraction1 = new RefinedAbstraction(implementor1);

        abstraction.operation();
        abstraction.otherOperation();

        abstraction1.operation();
        abstraction1.otherOperation();
    }
}
