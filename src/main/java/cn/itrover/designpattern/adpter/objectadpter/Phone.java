package cn.itrover.designpattern.adpter.objectadpter;

public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5v() == 5){
            System.out.println("可以充电");
        }
    }
}
