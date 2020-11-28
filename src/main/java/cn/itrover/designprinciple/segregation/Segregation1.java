package cn.itrover.designprinciple.segregation;

public class Segregation1 {
    public static void main(String[] args) {
        B b = new B();
        D d = new D();

        A a = new A();
        a.depend1(b);  //A 通过接口Interface1 依赖（使用） B
        a.depend3(b);
        a.depend5(b);

        C c = new C();
        c.depend1(d);//C 通过接口Interface1 依赖（使用） D
        c.depend2(d);
        c.depend4(d);
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");

    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}
class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");

    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

//不符合接口隔离原则
//A没有完全使用B的方法，即不是Interfaace1不是最小接口
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
}