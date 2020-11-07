package cn.itrover.designpattern.singleton;

import cn.itrover.designpattern.singleton.type3.Singleton02;

import java.lang.reflect.Constructor;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/9/24 8:34
 * @description
 * 反射破坏代理模式
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<Singleton02> clazz = Singleton02.class;
//        Class<Singleton01> clazz = Singleton01.class;
        Constructor<Singleton02> c = null;
        try {
            c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Singleton02 instance = c.newInstance();
            Singleton02 instance1 = c.newInstance();
            System.out.println(instance == instance1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
