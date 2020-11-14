package cn.itrover.designpattern.bridge;

/**
 * 桥接模式
 * 抽象类Phone实现了手机品牌与手机样式的桥接
 * 为的是减少类和扩展
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FullPhone(new XiaoMi());

        phone.open();
        phone.close();
    }
}
