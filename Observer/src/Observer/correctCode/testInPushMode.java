package Observer.correctCode;

import Observer.correctCode.PushMode.CurrentConditionDisplay;
import Observer.correctCode.PushMode.WeatherData;
import Observer.correctCode.PushMode.forecastDisplay;
import Observer.correctCode.PushMode.statisticDisplay;

import java.util.Observer;

public class testInPushMode {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer forecastDisplay = new forecastDisplay(weatherData);
        Observer statisticDisplay = new statisticDisplay(weatherData);

        weatherData.setMessurements(80,65,30.4f);
        weatherData.setMessurements(81,65,30.6f);
        weatherData.setMessurements(82,65,30.9f);
    }
}
