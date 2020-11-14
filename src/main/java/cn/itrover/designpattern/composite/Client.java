package cn.itrover.designpattern.composite;

/**
 * 组合模式
 * 树形结构，层级关系，大管小
 */
public class Client {
    public static void main(String[] args) {
        Component cqupt = new School("cqupt");

        College computerCollege = new College("计算机学院");
        College communicationCollege = new College("通信学院");

        computerCollege.add(new Department("网络空间安全"));
        computerCollege.add(new Department("计算机科学与技术"));
        communicationCollege.add(new Department("通信学院"));
        communicationCollege.add(new Department("信息工程"));

        cqupt.add(communicationCollege);
        cqupt.add(computerCollege);

        System.out.println(cqupt.getDes());
    }
}
