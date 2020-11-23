package cn.itrover.designpattern.memento.game;

/**
 * 守护者对象，用来保存备忘录对象
 */
public class Caretaker {

	private Memento  memento;
	// 用来保存memento（备忘录对象）
	//private ArrayList<Memento> mementos;
	//private HashMap<String, ArrayList<Memento>> rolesMementos;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}


}
