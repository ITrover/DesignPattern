package cn.itrover.designpattern.state.bilibili;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/25 11:10
 * 用户具体实现
 */
public class User implements IUser,ISwitchState{

    private State state = State.Normal;

    @Override
    public void expire() {
        state = State.Normal;
    }

    @Override
    public void payVip() {
        state = State.VIP;
    }

    @Override
    public void viewVideo() {
        state.viewVideo();
    }
}
