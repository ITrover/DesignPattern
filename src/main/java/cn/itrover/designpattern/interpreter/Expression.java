package cn.itrover.designpattern.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 *
 * @author itrover
 *
 */
public abstract class Expression {
	/**
	 *
	 * @param var 如 {a = 1,b = 2}
	 * @return
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
