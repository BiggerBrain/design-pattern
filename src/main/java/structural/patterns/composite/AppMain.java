
package structural.patterns.composite;

/**
 * @author lishixiong
 * @version 1.0: AppMain.java, v 0.1 2019年05月06日 16:28 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
        showTree(root);
    }

    //通过递归遍历树
    public static void showTree(Component root) {
        for (Component c : root.getChildren()) {

            if (c instanceof Leaf) { //叶子节点
                c.operation();
            } else { //树枝节点
                showTree(c);
            }
        }
    }
}