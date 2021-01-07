package Observer.badCode.displays;

public class statisticDisplay {
    static int temperature;
    static int pressure;
    static int humidity;

    public static void update(int temp, int pre, int humid){
        temperature = temp;
        pressure = pre;
        humidity = humid;
    }
}
