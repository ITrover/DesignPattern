package cn.itrover.designpattern.decorate;

/**
 * @author MaYunHao
 * @version 1.0
 * @description 装饰者：无线充电功能
 * @date 2020/2/17 0:47
 */

public class WireLessCharge extends Addition {

    public WireLessCharge(Phone phone) {
        super(phone);
    }

    @Override
    public String desc() {
        return phone.desc()+"无线充电";
    }
}
