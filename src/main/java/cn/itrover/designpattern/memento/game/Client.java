package cn.itrover.designpattern.memento.game;

public class Client {

	public static void main(String[] args) {
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);

		System.out.println("role " + "vit="+gameRole.getVit() + " def="+gameRole.getDef());
		gameRole.display();

		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());

		System.out.println("boss attach");
		gameRole.setDef(30);
		gameRole.setVit(30);
		gameRole.display();
		System.out.println("roll back");

		gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
		System.out.println("now");
		gameRole.display();
	}

}
