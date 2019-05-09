
package structural.patterns.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lishixiong
 * @version 1.0: Product.java, v 0.1 2019年05月06日 15:20 lishixiong Exp $
 * 用于过滤的类
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String name;
    private String type;
}