package creational.patterns.prototype;

import java.util.Hashtable;

public class ProductProtoTypeManager {
    private static Hashtable<String, Object> productProTypeMap
            = new Hashtable();

    static {
        //初始化cat
        ProductPrototype mailProduct = new MailProduct();
        mailProduct.setId("1");
        productProTypeMap.put(mailProduct.getId(), mailProduct);
        //初始化dog
        SmsProduct dog = new SmsProduct();
        dog.setId("2");
        productProTypeMap.put(dog.getId(), dog);
    }

    public static ProductPrototype getProductPrototype(String id) throws CloneNotSupportedException {
        //注意，在这里执行原型的克隆
        ProductPrototype product = (ProductPrototype) productProTypeMap.get(id);
        product.clone();
        return product;
    }
}
