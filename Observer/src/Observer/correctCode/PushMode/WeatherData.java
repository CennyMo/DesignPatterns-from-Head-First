package Observer.correctCode.PushMode;

import java.util.Observable;

public class WeatherData extends Observable {
    /*
    * Observable 中有 changed 作为状态是否改变的标识
    * 原来的observers替换为Observable类自带的obs
    * */
    //ArrayList<Observer> observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
    }

    public void messurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementChanged();
    }


    /*
    * 拉模式中，观察者使用weatherdata的getter获取状态
    * */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
