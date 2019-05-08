package behavioral.patterns.observer.jdk_observer;

import lombok.extern.log4j.Log4j2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lishixiong on 2017/11/10.
 */
@Log4j2
public class ForcastDisplay implements Observer, DisplayElement {
    private float      temp;
    private float      humidity;
    private float      pressure;
    private Observable observable;

    public ForcastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        log.info("fortemp : " + temp + "\t forhumidity : " + humidity + "\t forpressure : " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
