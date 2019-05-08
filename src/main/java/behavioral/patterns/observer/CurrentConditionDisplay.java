package behavioral.patterns.observer;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float   temp;
    private float   humidity;
    private float   pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("temp : " + temp + "\t humidity : " + humidity + "\t pressure : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
