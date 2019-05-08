package creational.patterns.prototype;

import lombok.extern.log4j.Log4j2;

/**
 * 1、原型模式用于创建重复对象，同时又能保证性能 2、原型模式实现了原型接口，该接口用于创建当前对象的克隆 3、原型模式用了Object方法的Cloneable方法，该方法执行的浅拷贝
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        MailProduct mailProduct = (MailProduct) ProductProtoTypeManager.getProductPrototype("1");
        MailProduct mailProduct1 = (MailProduct) mailProduct.clone();
        log.info(mailProduct == mailProduct1);//克隆，不是同一个对象的引用，false
        //-------------------------------------------------------------------------------------------------
        log.info(mailProduct.getId() + ":" + mailProduct1.getId() + ":" + (mailProduct.getId() == mailProduct1.getId()));//1:1:true,执行的是浅拷贝
        //-------------------------------------------------------------------------------------------------
        log.info("ProductPrototype type:" + mailProduct.getType());
        SmsProduct smsProduct = (SmsProduct) ProductProtoTypeManager.getProductPrototype("2");
        log.info("ProductPrototype type:" + smsProduct.getType());
    }
}
