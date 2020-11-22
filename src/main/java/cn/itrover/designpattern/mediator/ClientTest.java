package cn.itrover.designpattern.mediator;

/**
 * 中介者模式将类与类之间的网状耦合，变成一中介者为中心的星状耦合
 * 场景：当多个类之间存在多对多的相互关联时，使用中介者模式可以降低耦合性
 */
public class ClientTest {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		// 设置同一个中介者
		Alarm alarm = new Alarm(mediator, "alarm");
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		// 通过发送状态来通过中介者调动其他设备
		// 闹钟响了，然后其他设备配合工作
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
