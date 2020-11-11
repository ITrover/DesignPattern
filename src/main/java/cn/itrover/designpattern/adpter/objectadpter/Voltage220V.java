package cn.itrover.designpattern.adpter.objectadpter;

public class Voltage220V {
    public int output220v(){
        int src = 220;
        System.out.println("电源输出"+src+"v");
        return src;
    }
}
