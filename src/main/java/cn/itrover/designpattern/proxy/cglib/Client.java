package cn.itrover.designpattern.proxy.cglib;


/**
 * cglib 代理
 * 动态代理，子类代理
 * 代理的类不能被final修饰
 * final/static修饰的方法不可以被增强
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        TeacherDao proxy = (TeacherDao) factory.getInstance();
        proxy.teach();
    }

}
