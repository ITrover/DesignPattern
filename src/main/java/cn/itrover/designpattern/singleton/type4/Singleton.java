package cn.itrover.designpattern.singleton.type4;

/**
 * 枚举方式
 * 注册式单例模式
 * 优点：
 *    线程安全
 *    防止反序列化重新创建新的对象
 *    防止反射破坏单例模式
 * 推荐使用
 */
public enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}
