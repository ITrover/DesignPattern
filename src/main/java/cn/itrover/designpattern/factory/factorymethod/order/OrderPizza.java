package cn.itrover.designpattern.factory.factorymethod.order;

import cn.itrover.designpattern.factory.factorymethod.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author itrover
 */
public abstract class OrderPizza {

	/**
	 * 定义一个抽象方法，createPizza , 让各个工厂子类自己实现
	 * @param orderType
	 * @return
	 */
	abstract AbstractPizza createPizza(String orderType);

	public OrderPizza() {
		AbstractPizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			// 调用的是各自实现的工厂方法
			pizza = createPizza(orderType);
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
	}



	private String getType() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String type = reader.readLine();
			return type;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
