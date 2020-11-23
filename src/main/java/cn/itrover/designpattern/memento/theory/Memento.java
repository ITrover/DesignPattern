package cn.itrover.designpattern.memento.theory;

/**
 * 备忘录对象，负责保存记录，即Originator的状态
 */
public class Memento {
	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}



}
