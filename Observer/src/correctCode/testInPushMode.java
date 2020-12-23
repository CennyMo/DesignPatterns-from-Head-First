package correctCode;

import correctCode.PushMode.CurrentConditionDisplay;
import correctCode.PushMode.WeatherData;
import correctCode.PushMode.forecastDisplay;
import correctCode.PushMode.statisticDisplay;

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
