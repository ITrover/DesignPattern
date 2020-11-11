package cn.itrover.designpattern.adpter.objectadpter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdpter());
    }
}
