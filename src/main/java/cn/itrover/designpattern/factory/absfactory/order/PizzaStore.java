package cn.itrover.designpattern.factory.absfactory.order;

/**
 * 客户端
 */
public class PizzaStore {

	public static void main(String[] args) {
		new OrderPizza(new LDFactory());
	}

}
