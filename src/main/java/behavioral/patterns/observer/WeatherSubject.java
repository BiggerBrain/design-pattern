package behavioral.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiongon ConcreteObserver,具体观察者
 */
public class WeatherSubject implements Subject {
    /**
     * 温度
     */
    private float          temp;
    private float          humidity;
    private float          pressure;
    private List<Observer> observers;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void uodate() {
        notifyObserver();
    }

    public void setWeatherDate(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        uodate();
    }
}
