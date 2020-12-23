package correctCode.ObserverImpl;

import correctCode.DisplayElement;
import correctCode.Observer;
import correctCode.Subject;

public class currentConditionDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    Subject weatherData;

    public currentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current Conditions:" + temperature + "F degree" + "and" + humidity + "% humidity");
    }
}
