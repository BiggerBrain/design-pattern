/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.iterator;

/**
 * @author lishixiong
 * @version 1.0: Iterator.java, v 0.1 2019年05月06日 22:32 lishixiong Exp $
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}