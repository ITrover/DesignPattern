package cn.itrover.designprinciple.inversion;

public class Dependency {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件:hello,world";
    }
}
//完成Person接收消息的功能
//分析
//  简单，容易想到
//  问题：直接依赖于类，当person增加接收短信的功能时，需要增加短信类，同时person要增加相应的接收方法
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
