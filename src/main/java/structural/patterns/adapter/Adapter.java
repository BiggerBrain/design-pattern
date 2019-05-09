
package structural.patterns.adapter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @version 1.0: Adapter.java, v 0.1 2019年05月06日 12:05 lishixiong Exp $
 * 适配器源类设计：
 * 1.继承
 * 2.实现目标接口
 * 3.适配
 * 适配器Adapter继承自Adaptee，同时又实现了目标(ITarget)接口。
 */
@Log4j2
public class Adapter extends Adaptee implements ITarget {
    //目标接口要求调用Request()这个方法名，但源类Adaptee没有方法Request()
    //因此适配器补充上这个方法名
    //但实际上Request()只是调用源类Adaptee的SpecificRequest()方法的内容
    //所以适配器只是将SpecificRequest()方法作了一层封装，封装成Target可以调用的Request()而已
    @Override
    public void Request() {
        log.info("进入适配器的新接口方法");
        this.SpecificRequest();
        log.info("执行完适配的新接口方法");
    }

}