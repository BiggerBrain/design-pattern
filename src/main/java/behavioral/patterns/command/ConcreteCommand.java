
package behavioral.patterns.command;

/**
 * @author lishixiong
 * @version 1.0: ConcreteCommand.java, v 0.1 2019年05月06日 22:11 lishixiong Exp $
 */
public class ConcreteCommand implements ICommand {
    //持有相应的接收者对象
    private Receiver receiver = null;

    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }

}