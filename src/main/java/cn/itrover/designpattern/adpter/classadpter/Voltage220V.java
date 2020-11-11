package cn.itrover.designpattern.adpter.classadpter;

/**
 * 被适配的类
 */
public class Voltage220V {
    public int output220v(){
        int src = 220;
        System.out.println("电源输出"+src+"v");
        return src;
    }
}
