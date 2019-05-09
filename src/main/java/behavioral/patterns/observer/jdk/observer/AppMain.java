package behavioral.patterns.observer.jdk.observer;

import java.util.Observer;

/**
 * @author lishixiong
 */
public class
AppMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer forcastDisplay = new ForcastDisplay(weatherData);
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        // weatherData.deleteObserver(forcastDisplay);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
    }
}
