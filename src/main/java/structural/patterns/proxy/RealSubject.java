
package structural.patterns.proxy;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: RealSubject.java, v 0.1 2019年05月08日 11:10 lishixiong Exp $
 */
@Log4j2
public class RealSubject implements ISubject {
    @Override
    public void operation() {
        log.info("真实主题角色操作方法!");
    }
}