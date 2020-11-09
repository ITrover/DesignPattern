package cn.itrover.designpattern.factory.factorymethod.pizza;

public class BJPepperPizza extends AbstractPizza {
	@Override
	public void prepare() {
		setName("北京的胡椒pizza");
		System.out.println(" 北京的胡椒pizza 准备原材料");
	}
}
