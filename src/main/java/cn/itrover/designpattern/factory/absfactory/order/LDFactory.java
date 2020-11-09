package cn.itrover.designpattern.factory.absfactory.order;


import cn.itrover.designpattern.factory.absfactory.pizza.LDCheesePizza;
import cn.itrover.designpattern.factory.absfactory.pizza.LDPepperPizza;
import cn.itrover.designpattern.factory.absfactory.pizza.AbstractPizza;

/**
 * @author itrover
 * 工厂的伦敦实现
 */
public class LDFactory implements AbstractFactory {

	@Override
	public AbstractPizza createPizza(String orderType) {
		System.out.println("伦敦的披萨店");
		AbstractPizza abstractPizza = null;
		if (orderType.equals("cheese")) {
			abstractPizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			abstractPizza = new LDPepperPizza();
		}
		return abstractPizza;
	}

}
