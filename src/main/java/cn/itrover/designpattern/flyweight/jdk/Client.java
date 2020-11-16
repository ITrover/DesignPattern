package cn.itrover.designpattern.flyweight.jdk;

/**
 * 在Integer的使用
 */
public class Client {
    public static void main(String[] args) {
        Integer x1 = new Integer(127);
        // 只有使用Integer.valueOf和自动装箱才会返回缓存的整数
        Integer x2 = Integer.valueOf(127);
        Integer x5 = 127;
        Integer x3 = Integer.valueOf(127);
        Integer x4 = new Integer(127);

        System.out.println(x2 == x3);
        System.out.println(x1 == x4);
        System.out.println(x1 == x2);
        // 整型和数字对比时，是数字对比（整型会返回一个int），不是地址对比
        System.out.println(127 == x1);
        System.out.println(127 == x2);
        System.out.println(new Integer(1) == new Integer(1));
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
    }
}
