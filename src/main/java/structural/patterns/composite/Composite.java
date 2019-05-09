
package structural.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: Composite.java, v 0.1 2019年05月06日 16:26 lishixiong Exp $
 */
public class Composite extends Component {
    //树枝构件容器
    private ArrayList<Component> branch = new ArrayList<Component>();

    //增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.branch.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.branch.remove(component);
    }

    //获得分支下的所有叶子构件和树枝构件
    public List<Component> getChildren() {
        return this.branch;
    }
}
