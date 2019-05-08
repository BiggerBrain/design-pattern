package structural.patterns.bridge;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong 另一个业务接口的实现类，ConcreteImplementorA
 */
@Log4j2
class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        log.info("具体实现A");
    }
}

