package cn.itrover.designpattern.bridge;

/**
 * @author itrover
 */
public class upRightPhone extends Phone {

    public upRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("自立手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("自立手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("自立手机");
    }
}
