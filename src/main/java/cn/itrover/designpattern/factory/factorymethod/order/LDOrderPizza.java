package cn.itrover.designpattern.factory.factorymethod.order;


import cn.itrover.designpattern.factory.factorymethod.pizza.AbstractPizza;
import cn.itrover.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import cn.itrover.designpattern.factory.factorymethod.pizza.LDPepperPizza;

/**
 * @author itrover
 * 伦敦的pizza店
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
