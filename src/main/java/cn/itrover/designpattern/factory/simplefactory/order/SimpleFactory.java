package cn.itrover.designpattern.factory.simplefactory.order;

import cn.itrover.designpattern.factory.simplefactory.pizza.AbstractPizza;
import cn.itrover.designpattern.factory.simplefactory.pizza.CheesePizza;
import cn.itrover.designpattern.factory.simplefactory.pizza.GreekPizza;
import cn.itrover.designpattern.factory.simplefactory.pizza.PepperPizza;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/9 10:58
 * @description
 * 简单工厂模式（静态工厂）
 */
public class SimpleFactory {
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if ("papper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("papper");
        }
        return pizza;
    }
}
