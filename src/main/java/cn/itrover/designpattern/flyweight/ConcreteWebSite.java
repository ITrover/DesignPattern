package cn.itrover.designpattern.flyweight;

/**
 * 具体享元类
 */
public class ConcreteWebSite implements WebSite {
    /**
     * 这是内部状态，可共享 享元的元
     */
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /**
     * User 为外部状态，用来标记，不同的user可以用同一个ConcreteWebsite
     */
    @Override
    public void use(User user) {
        System.out.println(type + user.getName() );
    }
}
