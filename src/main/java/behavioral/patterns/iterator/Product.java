
package behavioral.patterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lishixiong
 * @version 1.0: Product.java, v 0.1 2019年05月06日 22:35 lishixiong Exp $
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