
package behavioral.patterns.responsibility.chain;

import lombok.Data;

/**
 * @author lishixiong
 * @version 1.0: Handler.java, v 0.1 2019年05月06日 21:50 lishixiong Exp $
 */
@Data

public abstract class Handler {
    /**
     * 持有后继的责任对象
     */
    protected Handler successor;
    protected String  name;

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();
}