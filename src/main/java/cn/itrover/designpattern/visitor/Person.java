package cn.itrover.designpattern.visitor;

/**
 * @author itrover
 */
public abstract class Person {

	public abstract void accept(Action action);
}
