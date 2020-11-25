package cn.itrover.designpattern.state.bilibili;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/25 11:12
 * 使用状态模式
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.viewVideo();
        System.out.println("buy vip");
        user.payVip();
        user.viewVideo();
        System.out.println("vip expire");
        user.expire();
        user.viewVideo();
    }
}
