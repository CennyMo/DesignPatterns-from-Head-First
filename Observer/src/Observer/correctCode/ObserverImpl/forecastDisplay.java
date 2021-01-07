package Observer.correctCode.ObserverImpl;

import Observer.correctCode.Observer;

public class forecastDisplay implements Observer {
    float temperature;
    float pressure;
    float humidity;

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
