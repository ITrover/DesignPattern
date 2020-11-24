package cn.itrover.designpattern.interpreter;

import java.util.HashMap;


/**
 * 变量的解释器
 * @author itrover
 *
 */
public class VarExpression extends Expression {
	/**
	 * key=a,key=b,key=c
	 */
	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	/**
	 * interpreter 根据 变量名称，返回对应值
	 * @param var {a=10, b=20}
	 * @return
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
