
package behavioral.patterns.status;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: StopState.java, v 0.1 2019年05月07日 17:50 lishixiong Exp $
 */
@Log4j2
@AllArgsConstructor
public class StopState implements State {
    private Context context;

    @Override
    public void start() {
        log.info("停止状态,开始启动!");
        context.setState(new StartState(context));
    }

    @Override
    public void running() {
        log.info("停止状态,不能直接运行!");

    }

    @Override
    public void stop() {
        log.info("停止状态...");
    }

    public String toString() {
        return "结束状态";
    }
}