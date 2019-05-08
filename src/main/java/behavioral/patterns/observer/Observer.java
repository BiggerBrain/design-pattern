package behavioral.patterns.observer;

/**
 * @author lishixiong on 2017/11/10.
 */
public interface Observer {
    // 更新温度湿度气压
    void update(float temp, float humidity, float pressure);
}
