package cn.itrover.designpattern.builder;

/**
 * 具体建造者
 */
public class XiaoMi extends Builder {

    @Override
    public void core() {
        phone.setCore("骁龙865");
    }

    @Override
    public void screen() {
        phone.setScreen("AMLOED");
    }

    @Override
    public void camera() {
        phone.setCamera("108MP");
    }
}
