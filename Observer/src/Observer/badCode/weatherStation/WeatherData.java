package Observer.badCode.weatherStation;

import Observer.badCode.displays.currentConditionDisplay;
import Observer.badCode.displays.forecastDisplay;
import Observer.badCode.displays.statisticDisplay;

public class WeatherData {
    int temperature;
    int humidity;
    int pressure;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    /*
        一旦气象更新， 此方法被调用
    * */
    public void messurementChanged(){
        int temp = getTemperature();
        int humid = getHumidity();
        int pressure = getPressure();

        /*
        * 一旦有新的布告板，就要改变程序
        * */
        currentConditionDisplay.update(temp,pressure,humid);
        forecastDisplay.update(temp,pressure,humid);
        statisticDisplay.update(temp,pressure,humid);
    }
}
