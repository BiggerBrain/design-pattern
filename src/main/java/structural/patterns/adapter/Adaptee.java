
package structural.patterns.adapter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Adaptee.java, v 0.1 2019年05月06日 12:04 lishixiong Exp $
 * 适配源类
 */
@Log4j2
public class Adaptee {
    public void SpecificRequest() {
        log.info("适配源类的老接口");
    }
}