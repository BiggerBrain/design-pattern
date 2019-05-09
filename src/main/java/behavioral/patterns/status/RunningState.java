
package behavioral.patterns.status;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: RunningState.java, v 0.1 2019年05月08日 10:00 lishixiong Exp $
 */
@Log4j2
@AllArgsConstructor
public class RunningState implements State {
    private Context context;

    @Override
    public void start() {
        log.info("运行状态,不能直接启动!");
    }

    @Override
    public void running() {
        log.info("运行状态中...");
    }

    @Override
    public void stop() {
        log.info("运行状态，开始停止!");
        context.setState(new StopState(context));
    }

    public String toString() {
        return "运行状态";
    }
}