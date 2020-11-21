package cn.itrover.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 订阅站
 */
public class WeatherData implements Subject{

    private float temperature;

    private float humidity;

    private float oxygenContent;

    private List<Observable> observables;

    public WeatherData() {
        observables = new ArrayList <>();
    }

    public void  setData(float temperature, float humidity, float oxygenContent){
        this.temperature = temperature;
        this.humidity = humidity;
        this.oxygenContent = oxygenContent;
        //调用时，通知其他观察者。
        notifyObserves();
    }


    @Override
    public void register(Observable observable) {
        observables.add(observable);
    }

    @Override
    public void remove(Observable observable) {
        observables.remove(observable);
    }

    @Override
    public void notifyObserves() {
        for (Observable observable:observables
             ) {
            observable.update(temperature,humidity,oxygenContent);
        }
    }
}
