package cn.itrover.designprinciple.inversion;

/**
 * 依赖传递的三种方式
 */
public class DependencyPass {
    public static void main(String[] args) {
        XiaoMi xiaoMi = new XiaoMi();
        //通过接口的方式
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.desc(xiaoMi);
        //通过构造器
//        OpenAndClose openAndClose = new OpenAndClose(xiaoMi);
//        openAndClose.desc();
        //通过setter
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(xiaoMi);
        openAndClose.open();
    }
}

interface ITV{
    void play();
}
class XiaoMi implements ITV{

    @Override
    public void play() {
        System.out.println("XiaoMi tv 正在 play");
    }
}




//1. 接口传递
//interface IOpenAndClose{
//    void desc(ITV tv);
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void desc(ITV tv) {
//        tv.play();
//    }
//}

//2. 构造方法传递
//interface IOpenAndClose{
//    void desc();
//}
//class OpenAndClose implements IOpenAndClose{
//    private ITV tv;
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void desc() {
//        tv.play();
//    }
//}

//3. setter方法传递
interface IOpenAndClose{
    void open();
}
class OpenAndClose implements  IOpenAndClose{

    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

