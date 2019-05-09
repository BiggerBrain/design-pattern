
package behavioral.patterns.command;

/**
 * @author lishixiong
 * @version 1.0: Invoker.java, v 0.1 2019年05月06日 22:13 lishixiong Exp $
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private ICommand command = null;

    /**
     * 构造方法
     */
    public Invoker(ICommand command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {

        command.execute();
    }
}