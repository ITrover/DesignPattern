package cn.itrover.designpattern.proxy.staticproxy;

/**
 * @author itrover
 * 静态代理
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
