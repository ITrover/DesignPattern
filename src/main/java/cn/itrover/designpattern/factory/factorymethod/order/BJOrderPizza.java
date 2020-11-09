package cn.itrover.designpattern.factory.factorymethod.order;

import cn.itrover.designpattern.factory.factorymethod.pizza.AbstractPizza;
import cn.itrover.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import cn.itrover.designpattern.factory.factorymethod.pizza.BJPepperPizza;

/**
 * @author itrover
 * 北京的pizza店
 */
public class BJOrderPizza extends OrderPizza {


	@Override
	AbstractPizza createPizza(String orderType) {

		AbstractPizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
