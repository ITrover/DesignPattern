package cn.itrover.designpattern.builder;

/**
 * 具体建造者
 */
public class HUAWEI extends Builder{
    @Override
    public void core() {
        phone.setCore("麒麟990");
    }

    @Override
    public void screen() {
        phone.setScreen("京东方");
    }

    @Override
    public void camera() {
        phone.setCamera("4000p");
    }
}
