package cn.itrover.designpattern.builder;

/**
 * 建造者模式
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new HUAWEI());
        Phone phone = director.createPhone();
        System.out.println(phone);
    }

}
