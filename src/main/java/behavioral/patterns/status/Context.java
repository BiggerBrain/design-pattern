
package behavioral.patterns.status;

/**
 * @author lishixiong
 * @version 1.0: Context.java, v 0.1 2019年05月07日 17:50 lishixiong Exp $
 */
public class Context implements State {

    private State state;

    public Context() {
        state = new InitState(this);
    }

    @Override
    public void start() {
        state.start();
    }

    @Override
    public void running() {
        state.running();
    }

    @Override
    public void stop() {
        state.stop();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "当前状态：" + state.toString();
    }
}