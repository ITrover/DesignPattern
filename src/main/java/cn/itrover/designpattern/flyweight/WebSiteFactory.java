package cn.itrover.designpattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类
 */
public class WebSiteFactory {

    private static HashMap<String,WebSite> pool = new HashMap <>();

    public static WebSite getWebSite(String type){
        WebSite webSite = pool.get(type);
        if(webSite == null){
            webSite = new ConcreteWebSite(type);
            pool.put(type,webSite);
        }
        return webSite;
    }
}
