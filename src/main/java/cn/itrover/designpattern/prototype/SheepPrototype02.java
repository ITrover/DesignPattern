package cn.itrover.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * @author itrover
 * 使用序列化的方式深拷贝
 */
@Getter
@Setter
@ToString
public class SheepPrototype02 implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String sex;
    private Friend friend;
    /**
     * 深拷贝 方式2
     * 序列化
     * @return
     */
    public Object deepClone(){
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis );
            Object o = ois.readObject();
            return o;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("关闭流");
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

