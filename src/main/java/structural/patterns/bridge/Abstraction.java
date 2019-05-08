package structural.patterns.bridge;

/**
 * @author lishixiong 抽象层，在这里对接口进行聚合设计
 */
abstract class Abstraction {
    // 持有一个 Implementor 对象，形成聚合关系
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    // 可能需要转调实现部分的具体实现
    public void operation() {
        implementor.operationImpl();
    }
}