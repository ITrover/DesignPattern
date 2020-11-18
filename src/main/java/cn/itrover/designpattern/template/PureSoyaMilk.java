package cn.itrover.designpattern.template;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/18 14:04
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    protected void addCondiments() {

    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
