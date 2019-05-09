package behavioral.patterns.observer;

/**
 * @author lishixiong
 */
public class AppMain {
    public static void main(String[] args) {
        WeatherSubject weatherData = new WeatherSubject();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer forcastDisplay = new ForcastDisplay(weatherData);
        weatherData.removeObserver(forcastDisplay);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.3f, 22.4f, 33.2f);

    }
}
