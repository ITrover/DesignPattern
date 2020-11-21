package cn.itrover.designpattern.observer;

/**
 * 观察者模式
 * 使程序可拓展
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Baidu baidu = new Baidu();
        Sina sina = new Sina();
        weatherData.register(baidu);
        weatherData.register(sina);
        weatherData.setData(120f,20f,22f);
    }
}
