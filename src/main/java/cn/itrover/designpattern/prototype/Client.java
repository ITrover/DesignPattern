package cn.itrover.designpattern.prototype;

/**
 * @author itrover
 * 原型模式
 * 就是实现了Cloneable的类
 * 优点：简化类的创建，提高效率
 * 缺点：可能会对原来以有的类进行改造
 */
public class Client {

    public static void main(String[] args) throws Exception {
        SheepPrototype02 sheep = new SheepPrototype02 ();
        sheep.setAge(1);
        sheep.setName("tom");
        sheep.setSex("公");
        Friend friend = new Friend();
        friend.setName("join");
        sheep.setFriend(friend);
        SheepPrototype02 sheep1 = (SheepPrototype02) sheep.deepClone();
        SheepPrototype02 sheep2 = (SheepPrototype02) sheep.deepClone();
        sheep1.getFriend().setName("hon");
        System.out.println(sheep1);
        System.out.println(sheep2);
    }

}
