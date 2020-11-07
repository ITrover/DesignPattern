package cn.itrover.designpattern.singleton.type2;

/**
 * 懒汉式（线程不安全，同步代码块）
 * 不能使用
 */
public class Singleton03 {

    /**
     * 私有化构造方法
     */
    private Singleton03(){ }

    private static Singleton03 instance;


    public static Singleton03 getInstance(){
        if(instance == null){
            // 不能解决线程安全问题，只要有多个线程进入if，就会产生多个实例
            synchronized (Singleton03.class){
                instance = new Singleton03();
            }
        }
        return instance;
    }

}
