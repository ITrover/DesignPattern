package cn.itrover.designpattern.observer;

/**
 * 观察者的实现，新浪
 */
public class Sina implements Observable {
    @Override
    public void update(float temperature, float humidity, float oxygenContent) {
        System.out.println("新浪网站获取的天气");
        System.out.println("温度："+temperature);
        System.out.println("适度: "+humidity);
        System.out.println("氧气含量："+oxygenContent);
    }
}
