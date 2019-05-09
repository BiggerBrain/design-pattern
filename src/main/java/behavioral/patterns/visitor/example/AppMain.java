package behavioral.patterns.visitor.example;

/**
 * @author lishixiong 他人例子
 */
public class AppMain {
    public static void main(final String[] args) {
        final ObjectStructure os = new ObjectStructure();
        os.addElement(new GladiolusConcreteElement());
        os.addElement(new ChrysanthemumConreteElement());

        final GladiolusVisitor gVisitor = new GladiolusVisitor();
        final ChrysanthemumVisitor chVisitor = new ChrysanthemumVisitor();

        os.accept(gVisitor);
        os.accept(chVisitor);

    }

}
