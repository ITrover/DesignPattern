package cn.itrover.designpattern.visitor;

/**
 * @author itrover
 */
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}
