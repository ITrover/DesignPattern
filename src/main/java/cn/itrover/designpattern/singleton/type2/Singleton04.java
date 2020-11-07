package cn.itrover.designpattern.singleton.type2;


/**
 * 懒汉式（双重检查）
 * 优点：线程安全，懒加载，效率较高
 * 推荐使用
 */
public class Singleton04 {

    /**
     * 私有化构造方法
     */
    private Singleton04() {
    }

    private static volatile Singleton04 instance;

    public static Singleton04 getInstance() {
        //双重检查
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }

}
