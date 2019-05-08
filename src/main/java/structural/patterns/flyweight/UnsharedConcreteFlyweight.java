/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.flyweight;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: UnsharedConcreteFlyweight.java, v 0.1 2019年05月06日 18:36 lishixiong Exp $
 */
@Log4j2
public class UnsharedConcreteFlyweight implements IFlyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        // super(extrinsic);
    }

    @Override
    public void operation(String state) {
        log.info("不共享的具体Flyweight");

    }

}