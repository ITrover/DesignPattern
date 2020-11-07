package cn.itrover.designpattern.singleton.type2;

/**
 * 懒汉式（线程不安全）
 * 优点：起到了懒加载效果
 * 缺点：在多线程下可能多个线程同时进入if（instance == null），导致产生多个实例
 * 结论：只能在单线程下使用，在实际开发中不要使用
 */
public class Singleton01 {

    /**
     * 私有化构造方法
     */
    private Singleton01(){ }

    private static Singleton01 instance;

    /**
     * 当使用到时，才创建对象实例
     */
    public static Singleton01 getInstance(){
        if(instance == null){
            instance = new Singleton01();
        }
        return instance;
    }
}
