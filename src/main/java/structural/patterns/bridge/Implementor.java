package structural.patterns.bridge;

/**
 * @author lishixiong 实现类的接口，在抽象层通过Implementor进行聚合，类图呈现"桥接"模式
 */
interface Implementor {
    // 实现抽象部分需要的某些具体功能
    void operationImpl();
}