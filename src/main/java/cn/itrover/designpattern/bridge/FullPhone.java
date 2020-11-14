package cn.itrover.designpattern.bridge;

/**
 * @author MaYunHao
 */
public class FullPhone extends Phone {
    public FullPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("全手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("全手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("全手机");
    }
}
