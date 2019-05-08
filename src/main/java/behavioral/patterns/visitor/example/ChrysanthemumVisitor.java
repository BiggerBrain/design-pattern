package behavioral.patterns.visitor.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class ChrysanthemumVisitor implements Visitor {
    @Override
    public void visit(final GladiolusConcreteElement gladiolus) {
        log.info(this.getClass().getSimpleName() + " access " + gladiolus.getClass().getSimpleName());
    }

    @Override
    public void visit(final ChrysanthemumConreteElement chrysanthemum) {
        log.info(this.getClass().getSimpleName() + " access " + chrysanthemum.getClass().getSimpleName());
    }

}
