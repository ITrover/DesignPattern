package cn.itrover.designpattern.chain;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/27 19:42
 */
public class GoodProgrammer extends Programmer {
    @Override
    void handle(Bug bug) {
        if (bug.value > 50 && bug.value <= 100) {
            solve(bug);
        }else{
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("优秀程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
