package cn.itrover.designpattern.proxy.staticproxy;

/**
 * 代理对象
 * 有点像装饰者模式的装饰器
 * 对代理目标（teacherDao）的方法增强
 */
public class TeacherDaoProxy implements ITeacher {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }


    @Override
    public void teach() {
        System.out.println("代理开始");
        teacherDao.teach();
        System.out.println("代理结束");
    }
}
