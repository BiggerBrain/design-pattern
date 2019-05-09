
package behavioral.patterns.status;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月07日 17:51 lishixiong Exp $
 * 状态模式分三步走：
 * 1.一个环境类，环境类行为由状态类控制
 * 2.几个状态类，状态类控制环境类的方法，同时也负责状态装换过程
 * 3.状态类保持对环境类的引用
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.start();
        context.running();
        context.stop();
        log.info(context.toString());

        context = new Context();
        context.start();
        context.running();
        context.stop();
        log.info(context.toString());

        context = new Context();
        context.start();
        context.running();
        context.stop();
        log.info(context.toString());

        context = new Context();
        context.start();
        context.running();
        context.stop();
        log.info(context.toString());
    }
}