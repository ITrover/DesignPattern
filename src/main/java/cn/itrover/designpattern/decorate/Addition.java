package cn.itrover.designpattern.decorate;

/**
 * @author MaYunHao
 * @version 1.0
 * @description 抽象装饰者
 * @date 2020/2/17 0:45
 */
public abstract class Addition implements Phone {
    public Phone phone;

    public Addition(Phone phone) {
        this.phone = phone;
    }

}
