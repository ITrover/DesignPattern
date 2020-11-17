package cn.itrover.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author itrover
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类，即代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        Object result = method.invoke(target, objects);
        System.out.println("代理结束");
        return result;
    }

}
