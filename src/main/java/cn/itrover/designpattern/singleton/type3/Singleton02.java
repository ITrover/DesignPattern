package cn.itrover.designpattern.singleton.type3;

/**
 * 静态内部类 + 构造器避免创建多个实例
 * 优点：
 * 线程安全，类的静态属性只会在第一次转装载类的时候初始化
 * 懒加载，静态内部类在Singleton类加载时不会被装载，只有在第一次调用getInstance方法时才会装载SingletonInstance实例化INSTANCE
 * 效率高
 * 防止反射破坏单例
 * 推荐使用
 *
 * 在构造器中添加判断
 * 避免通过反射破坏单例
 */
public class Singleton02 {

    /**
     * 私有化构造方法
     */
    private Singleton02() {
        // 防止反射破坏单例
        if (SingletonInstance.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 静态内部类
     */
    private static class SingletonInstance {
        private static final Singleton02 INSTANCE = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
