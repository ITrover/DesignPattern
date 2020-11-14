package cn.itrover.designpattern.decorate;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * @author MaYunHao
 * @version 1.0
 * @description 装饰器模式
 * @date 2020/2/17 0:48
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("普通手机");
        Phone phone = new XiaoMi();
        System.out.println(phone.desc());
        System.out.println("外加功能");
        // 添加NFC
        phone = new NFC(phone);
        System.out.println(phone.desc());
        System.out.println("外加功能");
        // 添加遥控
        phone = new YaoKong(phone);
        // 添加无线充电
        phone = new WireLessCharge(phone);

        // 一层一层被装饰
        Phone p = new WireLessCharge(new NFC(new YaoKong(new XiaoMi())));

        System.out.println(phone.desc());
    }
}
