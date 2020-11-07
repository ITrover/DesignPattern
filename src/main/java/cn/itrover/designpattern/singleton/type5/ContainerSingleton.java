package cn.itrover.designpattern.singleton.type5;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/9/24 8:59
 * @description
 * 容器式单例模式
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static ConcurrentHashMap<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }
}
