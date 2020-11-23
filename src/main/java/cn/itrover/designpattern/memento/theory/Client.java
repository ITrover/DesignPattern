package cn.itrover.designpattern.memento.theory;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("100");

		caretaker.add(originator.saveStateMemento());

		originator.setState("80");

		caretaker.add(originator.saveStateMemento());

		originator.setState("70");
		caretaker.add(originator.saveStateMemento());

		System.out.println("now:" + originator.getState());

		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("roll back");
		System.out.println("now:" + originator.getState());



	}

}
