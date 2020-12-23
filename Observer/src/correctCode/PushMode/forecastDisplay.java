package correctCode.PushMode;


import correctCode.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class forecastDisplay implements Observer, DisplayElement {
    Observable observable;
    float lastPressure;
    float currentPressure = 29.0f;

    public forecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg){
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("Forecast: lastPressure is: "+ lastPressure + " and currentPressure is: " + currentPressure);
    }
}
