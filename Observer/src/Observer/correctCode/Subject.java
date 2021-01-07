package Observer.correctCode;

public interface Subject {
    /*
    * 主题只需要知道观察者实现了某个接口，而不用关心其具体实现
    * 有新的观察者（布告板）出现，主题代码无需修改，注册即可
    * */
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
