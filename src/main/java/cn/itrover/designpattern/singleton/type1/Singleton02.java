package cn.itrover.designpattern.singleton.type1;

/**
 * 饿汉式（静态代码块）
 * 优点：写法简单，在类装载时就完成了实例化，避免线程同步问题
 * 缺点：在类装载时就完成了实例化，可能导致内存浪费
 */
public class Singleton02 {

    /**
     * 私有化构造方法
     */
    private Singleton02(){ }

    private static Singleton02 instance;
    static {
        //在静态代码块，创建实例对象
        instance = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return instance;
    }

}
