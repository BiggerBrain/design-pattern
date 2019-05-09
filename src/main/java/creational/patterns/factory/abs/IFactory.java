
package creational.patterns.factory.abs;

/**
 * @author lishixiong
 * @version 1.0: IFactory.java, v 0.1 2019年04月30日 17:02 lishixiong Exp $
 * 工厂接口
 */
interface IFactory {
    /**
     * interface默认public，不需要写
     *
     * @return
     */
    ISmsProduct createProduct1();

    IMailProduct createProduct2();
}
