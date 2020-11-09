package cn.itrover.designpattern.factory.factorymethod.pizza;

public class LDCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
