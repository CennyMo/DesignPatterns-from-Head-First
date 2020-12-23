package correctCode;


import correctCode.ObserverImpl.currentConditionDisplay;
import correctCode.SubjectImpl.WeatherData;

public class test {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new currentConditionDisplay(weatherData);

        weatherData.setMessurements(80,65,30.4f);
    }
}
