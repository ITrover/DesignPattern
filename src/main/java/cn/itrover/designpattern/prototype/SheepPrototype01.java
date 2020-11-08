package cn.itrover.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author itrover
 * 必须要实现Cloneable（标记接口）接口
 * 重写clone方法实现深拷贝
 */
@Getter
@Setter
@ToString
public class SheepPrototype01 implements Cloneable{
    private String name;
    private Integer age;
    private String sex;
    private Friend friend;
    /**
     * 深拷贝 方式1
     * 重写clone方法
     * 将引用对象再clone
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        SheepPrototype01 sheep = (SheepPrototype01) super.clone();
        //对引用对象，单独clone
        sheep.setFriend((Friend) sheep.getFriend().clone());
        return sheep;
    }
}

