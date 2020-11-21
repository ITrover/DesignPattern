package cn.itrover.designpattern.observer;

/**
 * 订阅接口
 */
public interface Subject {

    void register(Observable observable);

    void remove(Observable observable);

    void notifyObserves();
}
