package cn.itrover.designpattern.singleton.type2;

/**
 * 懒汉式（线程安全，同步方法）
 * 缺点：效率太低，执行getInstance方法每次都要同步，实际上只需要实例化一次对象，后续执行方法直接return即可
 * 不推荐使用
 */
public class Singleton02 {

    /**
     * 私有化构造方法
     */
    private Singleton02(){ }

    private static Singleton02 instance;

    /**
     * 加入同步代码，解决线程不安全问题
     * @return
     */
    public static synchronized Singleton02 getInstance(){
        if(instance == null){
            instance = new Singleton02();
        }
        return instance;
    }

}
