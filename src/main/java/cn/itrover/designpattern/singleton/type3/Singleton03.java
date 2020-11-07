package cn.itrover.designpattern.singleton.type3;

import java.io.Serializable;

/**
 * 静态内部类
 * 优点：
 * 线程安全，类的静态属性只会在第一次转装载类的时候初始化
 * 懒加载，静态内部类在Singleton类加载时不会被装载，只有在第一次调用getInstance方法时才会装载SingletonInstance实例化INSTANCE
 * 效率高
 * 推荐使用
 *
 * 创建readResolve
 * 反序列化时，会被调用
 * 防止反序列化破坏单例模式
 */
public class Singleton03 implements Serializable {

    /**
     * 私有化构造方法
     */
    private Singleton03() {
    }

    /**
     * 静态内部类
     */
    private static class SingletonInstance {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    /**
     * 避免反序列化破坏单例
     * 当序列化时，会通过反射调用本方法，返回单例对象
     * @return
     */
    private Object readResolve(){
        return SingletonInstance.INSTANCE;
    }
}
