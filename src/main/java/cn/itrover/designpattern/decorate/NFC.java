package cn.itrover.designpattern.decorate;

/**
 * @author MaYunHao
 * @version 1.0
 * @description 装饰者：NFC
 * @date 2020/2/17 0:46
 */

public class NFC extends Addition {

    public NFC(Phone phone) {
        super(phone);
    }

    @Override
    public String desc() {
        return phone.desc()+" nfc";
    }
}
