package creational.patterns.build;

/**
 * @author lishixiong
 */
public interface IBuilder {

    void buildName();

    void buildFunction();

    IProduct buildProduct();
}
