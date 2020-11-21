package cn.itrover.designpattern.observer;

/**
 * 观察者，用户
 */
public interface Observable {

    public void update(float temperature,float humidity,float oxygenContent);

}
