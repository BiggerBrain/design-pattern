package behavioral.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiongon 2017/11/10.
 */
public class WeatherData implements Subject {
    private float          temp;
    private float          humidity;
    private float          pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void messageChange() {
        notifyObserver();
    }

    public void setWeatherDate(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        messageChange();
    }
}
