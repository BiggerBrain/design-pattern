
package behavioral.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lishixiong
 * @version 1.0: Context.java, v 0.1 2019年05月06日 22:17 lishixiong Exp $
 */
public class Context {
    private Map valueMap = new HashMap<>();

    public void addValue(Variable x, int y) {
        valueMap.put(x, y);
    }

    public int LookupValue(Variable x) {
        return (int) valueMap.get(x);
    }
}