package behavioral.patterns.visitor.example;

/**
 * @author lishixiong
 */
public interface FlowerElement {
    void accept(Visitor visitor);
}
