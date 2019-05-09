package creational.patterns.build;

/**
 * @author lishixiong 1、建造者模式使用多个简单的对象一步一步构建一个复杂的对象 2、建造者模式的核心是在解耦对象的建造，适用于大型复杂对象的开发与构建 3、建造者设计模式属于创建型设计模式 建造者模式分为： Builder：抽象建造者
 * ConcreteBuilder：具体建造者 Director：指挥者 Product：产品角色
 */
public class AppMain {
    public static void main(String[] args) {
        Director director = new Director();
        IProduct manPerson = director.builderProduct(new SmsProductBuilder());
        IProduct womanPerson = director.builderProduct(new MailProductBuilder());
    }
}
