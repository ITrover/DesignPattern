package cn.itrover.designpattern.adpter.classadpter;

/**
 * 类上适配器
 * 通过继承
 */
public class VoltageAdpter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5v() {
        int dst = output220v() /44 ;
        System.out.println("通过适配器，转为了"+dst+"v");
        return dst;
    }
}
