package cn.itrover.designpattern.template;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/18 14:04
 */
public class RedBeanSoyaMilk extends SoyaMilk{
    @Override
    protected void addCondiments() {
        System.out.println("第二部：加上红豆");
    }

    @Override
    protected boolean customerWantCondiments() {
        return true;
    }
}
