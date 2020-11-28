package cn.itrover.designprinciple.segregation.improve;

public class Segregation2 {
    public static void main(String[] args) {
        B b = new B();
        D d = new D();

        A a = new A();
        a.depend1(b);
        a.depend3(b);
        a.depend5(b);

        C c = new C();
        c.depend1(d);
        c.depend2(d);
        c.depend4(d);
    }
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation3();
    void operation5();
}
interface Interface3{
    void operation2();
    void operation4();
}

class A {
    public void depend1(Interface1 i ){
        i.operation1();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
    public void depend5(Interface2 i){
        i.operation5();
    }
}
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface3 i){
        i.operation2();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
}

class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }


    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }


    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");

    }

}