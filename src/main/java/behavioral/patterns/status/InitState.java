
package behavioral.patterns.status;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: InitState.java, v 0.1 2019年05月08日 10:04 lishixiong Exp $
 * 必须传入context对象
 */
@Log4j2
@AllArgsConstructor
public class InitState implements State {
    private Context context;

    @Override
    public void start() {
        log.info("开始启动!");
        context.setState(new StartState(context));
    }

    @Override
    public void running() {
        log.info("初始状态,不能直接运行!");
    }

    @Override
    public void stop() {
        log.info("初始状态,不能直接停止!");
    }

    public String toString() {
        return "初始状态";
    }
}