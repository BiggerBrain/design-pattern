
package behavioral.patterns.responsibility.chain;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 21:52 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler("handler1");
        Handler handler2 = new ConcreteHandler("handler2");
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}