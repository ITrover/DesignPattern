package cn.itrover.designpattern.factory.simplefactory.pizza;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/9 10:53
 * @description
 */
public class PepperPizza extends AbstractPizza{
    @Override
    public void prepare() {
        System.out.println(name + " prepare");
    }
}
