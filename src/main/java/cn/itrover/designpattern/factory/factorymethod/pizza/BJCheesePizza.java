package cn.itrover.designpattern.factory.factorymethod.pizza;

public class BJCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
