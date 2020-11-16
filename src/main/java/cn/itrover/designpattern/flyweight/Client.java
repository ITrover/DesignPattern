package cn.itrover.designpattern.flyweight;

/**
 * 享元模式
 * 共享可用的单元（内部状态）
 * 将可以共用的提取出来共同使用
 * 将不可共用的外部传入。
 *
 */
public class Client {
    public static void main(String[] args) {
        WebSite blogsite = WebSiteFactory.getWebSite("博客");
        blogsite.use(new User("zhang"));
        WebSite blogsite1 = WebSiteFactory.getWebSite("博客");
        blogsite1.use(new User("hong"));

    }
}
