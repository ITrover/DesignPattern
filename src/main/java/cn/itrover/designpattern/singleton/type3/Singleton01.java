package cn.itrover.designpattern.singleton.type3;

import java.io.Serializable;

/**
 * 静态内部类
 * 优点：
 * 线程安全，类的静态属性只会在第一次转装载类的时候初始化
 * 懒加载，静态内部类在Singleton类加载时不会被装载，只有在第一次调用getInstance方法时才会装载SingletonInstance实例化INSTANCE
 * 效率高
 * 推荐使用
 */
public class Singleton01 implements Serializable {

    /**
     * 私有化构造方法
     */
    private Singleton01() {
    }

    /**
     * 静态内部类
     */
    private static class SingletonInstance {
        private static final Singleton01 INSTANCE = new Singleton01();
    }

    public static Singleton01 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
