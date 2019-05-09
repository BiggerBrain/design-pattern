/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.memento;

/**
 *
 * @author lishixiong
 * @version 1.0: Memento.java, v 0.1 2019年05月08日 18:05 lishixiong Exp $
 * 备忘录角色
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }
}