package cn.itrover.designpattern.proxy.dynamic;

/**
 * @author itrover
 */
public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师在上课");
    }
}
