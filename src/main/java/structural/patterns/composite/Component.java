
package structural.patterns.composite;

import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: IComponent.java, v 0.1 2019年05月06日 16:25 lishixiong Exp $
 */
public abstract class Component {
    //个体和整体都具有
    public void operation() {
        //编写业务逻辑
    }

    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);

    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);

    //获得分支下的所有叶子构件和树枝构件
    public abstract List<Component> getChildren();

}