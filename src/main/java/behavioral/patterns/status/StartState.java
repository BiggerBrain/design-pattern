
package behavioral.patterns.status;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: StartState.java, v 0.1 2019年05月07日 17:50 lishixiong Exp $
 */
@Log4j2
@AllArgsConstructor
public class StartState implements State {
    private Context context;

    @Override
    public void start() {
        log.info("开始状态中...");
    }

    @Override
    public void running() {
        log.info("开始状态,转变运行状态!");
        context.setState(new RunningState(context));
    }

    @Override
    public void stop() {
        log.info("开始状态,转变停止状态!");
        context.setState(new StopState(context));
    }

    public String toString() {
        return "开始状态";
    }
}