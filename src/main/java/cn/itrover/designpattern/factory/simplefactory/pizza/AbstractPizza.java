package cn.itrover.designpattern.factory.simplefactory.pizza;

import lombok.*;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/9 10:50
 * 抽象类
 */
@Getter
@Setter
@ToString
public abstract class AbstractPizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }
    public void cut(){
        System.out.println(name + " cutting");
    }
    public void box(){
        System.out.println(name + " boxing");
    }
}
