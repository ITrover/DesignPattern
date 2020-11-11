package cn.itrover.designpattern.adpter.interfaceadpter;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/11 15:40
 */
public class Client {
    public static void main(String[] args) {
        Interface4 i = new AbstractAdapter(){
            @Override
            public void m1() {
                System.out.println("我用的时候再重写方法");
            }
        };
        i.m1();
    }
}
