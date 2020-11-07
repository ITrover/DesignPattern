package cn.itrover.designpattern.singleton;

import cn.itrover.designpattern.singleton.type3.Singleton03;

import java.io.*;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/9/24 8:44
 * @description
 * 序列化破坏单例
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        Singleton03 s1 = null;
        Singleton03 s2 = Singleton03.getInstance();
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Singleton03)ois.readObject();
            ois.close();
            System.out.println(s1 == s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
