/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.memento;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author lishixiong
 * @version 1.0: CareTaker.java, v 0.1 2019年05月08日 18:06 lishixiong Exp $
 */
@Log4j2
public class CareTaker {
    private Memento memento;
    public void save(Memento memento){
        log.info("备忘录保存状态:" + memento.getState());
        this.memento = memento;
    }
    public Memento read(){
        log.info("备忘录读取状态:" + memento.getState());
        return memento;
    }
}