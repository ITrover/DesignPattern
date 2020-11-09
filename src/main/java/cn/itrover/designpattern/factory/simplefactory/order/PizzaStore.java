package cn.itrover.designpattern.factory.simplefactory.order;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/9 11:11
 * 客户端
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
