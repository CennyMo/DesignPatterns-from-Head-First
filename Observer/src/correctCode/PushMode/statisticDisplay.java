package correctCode.PushMode;


import correctCode.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class statisticDisplay implements Observer, DisplayElement {

    Observable observable;
    float temperature;
    float minTemp = Float.MAX_VALUE;
    float maxTemp = Float.MIN_VALUE;
    float avg;

    public statisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg){
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            float currentTemp = weatherData.getTemperature();
            minTemp = Math.min(minTemp,currentTemp);
            maxTemp = Math.max(maxTemp,currentTemp);
            avg = (minTemp + maxTemp)/2;
            display();
        }
    }

    public void display(){
        System.out.println("AVG/MAX/MIN: " + avg + " " + maxTemp + " " + minTemp);
    }
}
