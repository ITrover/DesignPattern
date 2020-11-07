package cn.itrover.designpattern.singleton.type2;


import cn.itrover.designpattern.singleton.type4.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/7 19:08
 * @description
 */
public class ThreadSafeTest {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                // Singleton03会出现不同的对象
                // System.out.println(Singleton03.getInstance());

                // Singleton04线程安全
                 System.out.println(Singleton04.getInstance());
            }).start();
        }
    }
}
