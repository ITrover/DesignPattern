package cn.itrover.designpattern.singleton.type1;

/**
 * 饿汉式（静态变量）
 * 优点：写法简单，在类装载时就完成了实例化，避免线程同步问题
 * 缺点：在类装载时就完成了实例化，可能导致内存浪费
 */
public class Singleton01 {

    /**
     * 私有化构造方法
     */
    private Singleton01(){ }

    private final static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance(){
        return instance;
    }

}
