package cn.itrover.designpattern.proxy.dynamic;

/**
 * 动态代理，jdk代理
 * 代理对象必须实现接口
 */

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        //获取代理对象
        ITeacher proxy = (ITeacher) factory.getProxy();
        proxy.teach();
    }
}
