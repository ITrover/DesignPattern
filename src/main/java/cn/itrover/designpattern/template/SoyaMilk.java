package cn.itrover.designpattern.template;

/**
 * @author itrover
 * 抽象类
 */
public abstract class SoyaMilk {

    /**
     * 模板方法
     */
    final void make(){
        select();
        // 钩子方法，子类选择实现
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    protected abstract void addCondiments();


    /**
     * 钩子方法，决定是否需要添加配料
     * @return
     */
    protected abstract boolean customerWantCondiments();


    /**
     * 打碎
     */
    void beat(){
        System.out.println("第四步：黄豆和配两都放到豆浆机去打碎");
    }

    /**
     * 选黄豆
     */
    void select(){
        System.out.println("第一步：选择新鲜的黄豆");
    }

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("第三步：黄豆和配两开始浸泡");
    }





}
