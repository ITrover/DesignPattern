package cn.itrover.designpattern.adpter.classadpter;

/**
 * 使用者
 * 只能使用5v的电压
 */
public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5v() == 5){
            System.out.println("可以充电");
        }
    }
}
