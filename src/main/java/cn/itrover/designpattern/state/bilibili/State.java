package cn.itrover.designpattern.state.bilibili;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/25 11:05
 * 状态
 */
public enum State {
    // 普通用户
    Normal("normal"){
        @Override
        void viewVideo() {
            System.out.println("会员才能看");
        }
    },
    // vip 用户
    VIP("vip"){
        @Override
        void viewVideo() {
            System.out.println("开启会员专属画质");
        }
    };
    private String type;

    public String getType() {
        return type;
    }
    State(String type) {
        this.type = type;
    }

    abstract void viewVideo();
}
