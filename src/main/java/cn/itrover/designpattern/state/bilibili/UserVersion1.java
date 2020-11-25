package cn.itrover.designpattern.state.bilibili;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/25 11:23
 * 使用条件判断
 */
public class UserVersion1 implements IUser{
    private String type;

    public UserVersion1(String type) {
        this.type = type;
    }

    @Override
    public void viewVideo() {
        if ("normal".equals(type)){
            System.out.println("会员才能看");
        }else{
            System.out.println("开启会员专属画质");
        }
    }
}
