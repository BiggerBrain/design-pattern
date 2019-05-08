package structural.patterns.adapter;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 16:21 适配器模式是作为两个不兼容的接口之间的桥梁，适配器模式结合了两个独立接口的功能。 这种类型的设计模式属于结构型模式。 适配器模式是对原系统接口进行升级，其使用十分简单，可概括三步骤： 1.适配者继承系统原系统适配源类
 * 2.implement适配的Target接口 3.新适配接口业务逻辑编写
 */
public class AppMain {
    public static void main(String[] args) {
        ITarget target = new Adapter();
        target.Request();
    }
}
