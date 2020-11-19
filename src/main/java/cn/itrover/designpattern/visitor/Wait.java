package cn.itrover.designpattern.visitor;

/**
 * @author itrover
 */
public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("男人给的评价是待定");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人给定评价是待定");
	}

}
