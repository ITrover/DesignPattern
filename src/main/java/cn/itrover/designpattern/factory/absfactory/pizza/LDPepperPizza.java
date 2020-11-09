package cn.itrover.designpattern.factory.absfactory.pizza;

public class LDPepperPizza extends AbstractPizza {
	@Override
	public void prepare() {
		setName("伦敦胡椒披萨");
		System.out.println("伦敦胡椒披萨准备");
	}
}
