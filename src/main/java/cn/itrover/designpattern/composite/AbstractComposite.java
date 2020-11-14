package cn.itrover.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MaYunHao
 * @version 1.0
 * @date 2020/11/14 14:03
 * 组件、非叶子、用于存储子部件
 */
public abstract class AbstractComposite extends Component{
    private List<Component> components = new ArrayList<>();

    public AbstractComposite(String des) {
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
    }
}
