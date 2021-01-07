package Observer.correctCode.SubjectImpl;

import Observer.correctCode.Observer;
import Observer.correctCode.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if( i >= 0 ){ observers.remove(i); }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void messurementChanged(){
        notifyObserver();
    }

    public void setMessurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementChanged();
    }

}
