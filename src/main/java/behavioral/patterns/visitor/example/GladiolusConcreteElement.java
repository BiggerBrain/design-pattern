package behavioral.patterns.visitor.example;

/**
 * @author lishixiong
 */
public class GladiolusConcreteElement implements FlowerElement {
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}