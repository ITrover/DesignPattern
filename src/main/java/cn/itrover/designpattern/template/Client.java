package cn.itrover.designpattern.template;

/**
 * 模板方法模式
 * 规定执行流程 将方法按流程在模板方法中调用 一个大方法集中调用其他方法，如io流，把所有打开放在一起，所有关闭放在一起
 * 类似外观模式和建造者模式，思想都是将多个方法在一个方法中调用
 * 钩子（空方法） 子类选择重写
 */
public class Client {
    public static void main(String[] args) {
//        RedBeanSoyaMilk milk = new RedBeanSoyaMilk();
//        milk.make();
        PureSoyaMilk milk = new PureSoyaMilk();
        milk.make();
    }
}
