package behavioral.patterns.observer;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float   temp;
    private float   humidity;
    private float   pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("温度 : " + temp + "\t 湿度 : " + humidity + "\t 气压 : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
