package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class MailProductBuilder implements IBuilder {
    IProduct mailProduct;

    public MailProductBuilder() {
        mailProduct = new MailProduct();
    }

    public void buildFunction() {
        mailProduct.setFunction("mail产品功能设置");
        log.info("mail产品功能设置");
    }

    public void buildName() {
        mailProduct.setHead("mail产品名称设置");
        log.info("mail产品名称设置");
    }

    public IProduct buildProduct() {
        log.info("mail产品构造完成");
        return mailProduct;
    }
}  
