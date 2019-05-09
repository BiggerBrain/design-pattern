
package structural.patterns.composite;

import lombok.extern.log4j.Log4j2;

import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: Leaf.java, v 0.1 2019年05月06日 16:27 lishixiong Exp $
 */
@Log4j2
public class Leaf extends Component {
    @Override
    public void operation() {
        log.info("叶子节点");
    }

    public void add(Component component) {
        //空实现
    }

    public void remove(Component component) {
        //空实现
    }

    public List<Component> getChildren() {
        //空实现
        return null;
    }
}
