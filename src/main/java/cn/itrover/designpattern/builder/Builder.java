package cn.itrover.designpattern.builder;

/**
 * @author itrover
 * 抽象建造者
 */
public abstract class Builder {

    protected Phone phone = new Phone();

    public abstract void core();

    public abstract void screen();

    public abstract void camera();

    public Phone build(){
        return phone;
    }
}
