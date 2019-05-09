/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.flyweight;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author lishixiong
 * @version 1.0: ConcreteFlyweight.java, v 0.1 2019年05月09日 11:44 lishixiong Exp $
 */
@Log4j2
public class ConcreteFlyweight implements IFlyweight {
    private String intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFlyweight(String state){
        this.intrinsicState = state;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        log.info("Intrinsic 状态 = " + this.intrinsicState);
        log.info("Extrinsic 状态 = " + state);
    }
}