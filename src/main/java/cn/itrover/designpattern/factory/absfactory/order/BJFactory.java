package cn.itrover.designpattern.factory.absfactory.order;


import cn.itrover.designpattern.factory.absfactory.pizza.AbstractPizza;
import cn.itrover.designpattern.factory.absfactory.pizza.BJCheesePizza;
import cn.itrover.designpattern.factory.absfactory.pizza.BJPepperPizza;

/**
 * @author itrover
 * 工厂的北京实现
 */
public class BJFactory implements AbstractFactory {

	@Override
	public AbstractPizza createPizza(String orderType) {
		System.out.println("北京的披萨店");
		AbstractPizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
