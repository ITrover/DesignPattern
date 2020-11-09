package cn.itrover.designpattern.factory.absfactory.order;

import cn.itrover.designpattern.factory.absfactory.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OrderPizza {

	AbstractFactory factory;

	public OrderPizza(AbstractFactory factory) {
		setFactory(factory);
	}

	private void setFactory(AbstractFactory factory) {
		AbstractPizza pizza = null;
		String orderType = "";
		this.factory = factory;
		do {
			orderType = getType();
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("欢迎下次光临");
				break;
			}
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String type = reader.readLine();
			return type;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
}
