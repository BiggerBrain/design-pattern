
package structural.patterns.proxy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Proxy.java, v 0.1 2019年05月08日 11:11 lishixiong Exp $
 */
@Log4j2
public class Proxy implements ISubject {
    /**
     * 调用主题角色的方法
     */
    @Override
    public void operation() {
        RealSubject realSubject = new RealSubject();
        realSubject.operation();
        log.info("代理模式方法执行");
    }
}