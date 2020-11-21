package cn.itrover.designpattern.adpter.objectadpter;

/**
 * 对象适配器
 * 通过持有对象实现，聚合
 */
public class VoltageAdpter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdpter(Voltage220V v) {
        voltage220V = v;
    }

    @Override
    public int output5v() {
        int dst = voltage220V.output220v() /44 ;
        System.out.println("通过适配器，转为了"+dst+"v");
        return dst;
    }
}
