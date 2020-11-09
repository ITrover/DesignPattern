package cn.itrover.designpattern.factory.absfactory.order;


import cn.itrover.designpattern.factory.absfactory.pizza.AbstractPizza;

/**
 * @author itrover
 * 抽象工厂
 */
public interface AbstractFactory {
	/**
	 * 工厂方法
	 * @param orderType
	 * @return
	 */
	public AbstractPizza createPizza(String orderType);
}
