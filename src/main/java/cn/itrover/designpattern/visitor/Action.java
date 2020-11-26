package cn.itrover.designpattern.visitor;

/**
 * @author itrover
 */
public abstract class Action {

	public abstract void getManResult(Man man);
	
	public abstract void getWomanResult(Woman woman);
}
