package cn.itrover.designpattern.adpter.classadpter;

/**
 * 适配器模式
 * 为的是让原本因接口不匹配而不能一起工作的两个类可以协调工作
 * 一个类想使用另一类，但是因为接口不匹配而无法使用该类  ------>所有用一个适配器类让他们接口匹配从而使用该类
 * @author MaYunHao
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdpter());
    }
}
