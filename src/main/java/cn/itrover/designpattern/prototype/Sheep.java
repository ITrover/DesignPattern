package cn.itrover.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * @author itrover
 * 使用默认的clone，浅拷贝
 */
@Getter
@Setter
@ToString
public class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String sex;
    private Friend friend;

    /**
     * 默认的clone 是浅拷贝
     * 只能拷贝基本类型和string
     *
     * @return
     */
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}

