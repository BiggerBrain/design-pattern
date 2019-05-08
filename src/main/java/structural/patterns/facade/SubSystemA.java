/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.facade;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: SubSystemA.java, v 0.1 2019年05月06日 18:19 lishixiong Exp $
 */
@Log4j2
public class SubSystemA {
    public void operation() {
        log.info("子系统A的operation方法");
    }
}