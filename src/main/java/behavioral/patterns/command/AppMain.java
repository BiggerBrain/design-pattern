
package behavioral.patterns.command;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 22:14 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        ICommand command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}