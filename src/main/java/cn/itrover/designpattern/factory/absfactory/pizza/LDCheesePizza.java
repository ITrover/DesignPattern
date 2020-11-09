package cn.itrover.designpattern.factory.absfactory.pizza;

public class LDCheesePizza extends AbstractPizza {

	@Override
	public void prepare() {
		setName("伦敦的奶酪披萨");
		System.out.println("伦敦的奶酪披萨准备");
	}
}
