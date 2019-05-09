/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.memento;

import lombok.extern.log4j.Log4j2;

/**
 *
 * @author lishixiong
 * @version 1.0: Originator.java, v 0.1 2019年05月08日 18:05 lishixiong Exp $
 * 备忘录发起人角色：Originator
 */
@Log4j2
public class Originator {
    private String state;
    public void setState(String state) {
        log.info("设置状态:"+state);
        this.state = state;
    }
    public Memento save(){
        return new Memento(state);
    }
}