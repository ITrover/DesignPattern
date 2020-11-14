package cn.itrover.designpattern.bridge;

/**
 * @author itrover
 * 桥接，真正的实现在其他类
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void  close(){
        brand.close();
    }

    public void call(){
        brand.call();
    }


}
