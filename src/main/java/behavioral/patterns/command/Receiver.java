
package behavioral.patterns.command;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Receiver.java, v 0.1 2019年05月06日 22:10 lishixiong Exp $
 */
@Log4j2
public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action() {
        log.info("执行操作");
    }
}