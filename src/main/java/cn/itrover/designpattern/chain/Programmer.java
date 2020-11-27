package cn.itrover.designpattern.chain;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/27 19:40
 */
public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next){
        this.next = next;
    }
    abstract void handle(Bug bug);
}
