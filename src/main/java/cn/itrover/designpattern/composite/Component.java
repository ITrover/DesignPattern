package cn.itrover.designpattern.composite;

public abstract class Component {
    private String des;

    public Component(String des) {
        this.des = des;
    }

    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }
    protected void  remove(Component component){
        throw new UnsupportedOperationException();
    }

    public String getDes() {
        return des;
    }
}
