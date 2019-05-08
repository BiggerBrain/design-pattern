package structural.patterns.bridge;

import lombok.extern.log4j.Log4j2;

@Log4j2
class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        log.info("具体实现B");
    }
}
