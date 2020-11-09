package cn.itrover.designpattern.prototype;

import java.io.*;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/8 15:10
 * @description
 * 序列化测试
 */
public class Test {

    public static void main(String[] args) throws Exception {
        String path = "friend.obj";
/*
        // 保存对象
        Friend friend = new Friend();
        friend.setName("大傻逼");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
        oos.writeObject(friend);
*/
        // 读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
        Object object = ois.readObject();
        System.out.println(((Friend)object).getName());
    }
}
