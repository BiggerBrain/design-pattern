package structural.patterns.decorate;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.opreation();
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.opreation();
    }
}
