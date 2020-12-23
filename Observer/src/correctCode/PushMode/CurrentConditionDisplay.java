package correctCode.PushMode;

import correctCode.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    //重写update方法
    Observable observable;
    float temperature;
    float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg){
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.temperature;
            this.humidity = weatherData.humidity;
            display();
        }
    }

    public void display(){
        System.out.println("Current Conditions:" + temperature + "F degree" + "and" + humidity + "% humidity");
    }
}
