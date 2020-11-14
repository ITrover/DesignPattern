package cn.itrover.designpattern.decorate;

/**
 * @author MaYunHao
 * @version 1.0
 * @description 装饰者：遥控
 * @date 2020/2/17 0:47
 */

public class YaoKong extends Addition {

    public YaoKong(Phone phone) {
        super(phone);
    }

    @Override
    public String desc() {
        return phone.desc()+"遥控";
    }
}
