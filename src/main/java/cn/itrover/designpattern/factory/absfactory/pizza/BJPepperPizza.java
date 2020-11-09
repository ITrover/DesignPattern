package cn.itrover.designpattern.factory.absfactory.pizza;

public class BJPepperPizza extends AbstractPizza {
	@Override
	public void prepare() {
		setName("北京的胡椒披萨");
		System.out.println("北京的胡椒披萨准备");
	}
}
