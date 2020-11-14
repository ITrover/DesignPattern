package cn.itrover.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends AbstractComposite {
    public College(String des) {
        super(des);
    }
/*    private List<Component> components = new ArrayList<>();

    public College(String des) {
        super(des);
    }

    @Override
    protected void add(Component component) {
        components.add(component);
    }

    @Override
    protected void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String getDes() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDes());
        builder.append('\n');
        for (Component component : components) {
            builder.append(component.getDes());
            builder.append('\n');
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }*/
}
