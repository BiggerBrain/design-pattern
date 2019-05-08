package behavioral.patterns.observer;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class ForcastDisplay implements Observer, DisplayElement {
    private float   temp;
    private float   humidity;
    private float   pressure;
    private Subject subject;

    public ForcastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("fortemp : " + temp + "\t forhumidity : " + humidity + "\t forpressure : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
