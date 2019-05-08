package creational.patterns.build;

/**
 * @author lishixiong 建造对象
 */
public class Director {
    public IProduct builderProduct(IBuilder builder) {
        builder.buildName();
        builder.buildFunction();
        return builder.buildProduct();
    }
}