package behavioral.patterns.visitor.example;

/**
 * @author lishixiong
 */
public interface Visitor {
    void visit(GladiolusConcreteElement gladiolus);

    void visit(ChrysanthemumConreteElement chrysanthemum);
}
