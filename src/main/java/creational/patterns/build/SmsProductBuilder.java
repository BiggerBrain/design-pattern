package creational.patterns.build;

import lombok.extern.log4j.Log4j2;

/**
 *
 */
@Log4j2
public class SmsProductBuilder implements IBuilder {
    IProduct smsProduct;

    public SmsProductBuilder() {
        smsProduct = new SmsProduct();
    }

    public void buildFunction() {
        smsProduct.setFunction("sms产品功能设置");
        log.info("sms产品功能设置");
    }

    public void buildName() {
        smsProduct.setHead("sms产品名称设置");
        log.info("sms产品名称设置");
    }

    public IProduct buildProduct() {
        log.info("sms产品构造完成");
        return smsProduct;
    }
}
