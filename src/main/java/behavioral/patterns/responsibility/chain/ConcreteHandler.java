
package behavioral.patterns.responsibility.chain;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: ConcreteHandler.java, v 0.1 2019年05月06日 21:51 lishixiong Exp $
 */
@Log4j2
public class ConcreteHandler extends Handler {
    public ConcreteHandler(String name) {
        this.name = name;
    }

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */
        if (getSuccessor() != null) {
            log.info(name + "处理当前请求，并传递请求！");
            getSuccessor().handleRequest();
        } else {
            log.info(name + "没有后继者，自己处理完请求");
        }
    }
}