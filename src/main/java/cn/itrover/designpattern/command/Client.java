package cn.itrover.designpattern.command;

/**
 * 命令模式
 * 将命令发起者（controller或client） 和 命令接收者解耦（Receiver）
 * 命令接口(command)  桥梁作用
 * controller 不直接 操控 Receiver 而是通过Command实现对Receiver的控制
 */
public class Client {

    public static final String LIGHT = "light";

    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        LightReceiver light = new LightReceiver();
        controller.setCommand(LIGHT,new LightOnCommand(light),new LightOffCommand(light));
        controller.on(LIGHT);
        controller.undo();
        controller.off(LIGHT);
        controller.undo();
    }
}
