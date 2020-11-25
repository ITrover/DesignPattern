package cn.itrover.designpattern.state.bilibili;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/25 11:09
 * 切换状态接口
 */
public interface ISwitchState {
    /**
     * 过期
     */
    void expire();
    /**
     * 购买会员
     */
    void payVip();

}
