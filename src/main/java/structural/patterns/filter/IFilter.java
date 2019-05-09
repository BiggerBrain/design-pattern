
package structural.patterns.filter;

import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: IFilter.java, v 0.1 2019年05月06日 15:22 lishixiong Exp $
 * 过滤接口，也可以命名为ICriteria
 */
public interface IFilter {
    List<Product> filter(List<Product> productList);
}