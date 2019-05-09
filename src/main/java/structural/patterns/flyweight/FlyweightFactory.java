/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package structural.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lishixiong
 * @version 1.0: FlyweightFactory.java, v 0.1 2019年05月09日 11:51 lishixiong Exp $
 */
public class FlyweightFactory {
    private Map<String,IFlyweight> flyweightMap = new HashMap<>();

    public IFlyweight factory(String state){
        //先从缓存中查找对象
        IFlyweight flyweight = flyweightMap.get(state);
        if(flyweight == null){
            //如果对象不存在则创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            flyweightMap.put(state, flyweight);
        }
        return flyweight;
    }
}