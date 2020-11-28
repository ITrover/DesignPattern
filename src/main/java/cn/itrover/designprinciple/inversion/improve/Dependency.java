package cn.itrover.designprinciple.inversion.improve;

public class Dependency {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Duanxin());
    }
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件:hello,world";
    }
}

class Duanxin implements IReceiver{

    @Override
    public String getInfo() {
        return "短信：ok";
    }
}

interface IReceiver{
    String getInfo();
}


class Person{
    public void receive(IReceiver receiver){
        //依赖的是IReceiver 接口
        System.out.println(receiver.getInfo());
    }
}
