package cn.itrover.designpattern.factory.factorymethod.pizza;

/**
 * @author itrover
 */
public abstract class AbstractPizza {
	protected String name;

	public abstract void prepare();


	public void bake() {
		System.out.println(name + " baking;");
	}

	public void cut() {
		System.out.println(name + " cutting;");
	}

	public void box() {
		System.out.println(name + " boxing;");
	}

	public void setName(String name) {
		this.name = name;
	}
}
