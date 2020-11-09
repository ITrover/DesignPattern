package cn.itrover.designpattern.factory.simplefactory.order;

import cn.itrover.designpattern.factory.simplefactory.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/9 11:06
 */
public class OrderPizza {
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        AbstractPizza pizza = null;
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("欢迎下次光临");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String type = reader.readLine();
            return type;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
