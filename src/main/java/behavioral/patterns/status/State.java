
package behavioral.patterns.status;

/**
 * @author lishixiong
 * @version 1.0: State.java, v 0.1 2019年05月07日 17:49 lishixiong Exp $
 */
public interface State {
    void start();

    void running();

    void stop();
}