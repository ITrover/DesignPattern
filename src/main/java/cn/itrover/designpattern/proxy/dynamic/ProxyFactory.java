package cn.itrover.designpattern.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    /**
     * 代理目标
     */
    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxy(){
        /**
         * 参数说明
         * ClassLoader loader, 目标类加载器（固定）
         * Class<?>[] interfaces, 目标类实现的接口（固定）
         * InvocationHandler h 代理时需要执行的操作
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(proxy.getClass());
                System.out.println("代理开始");
                Object result = method.invoke(object, args);
                System.out.println("代理结束");
                return result;
            }
        });

    }

}
