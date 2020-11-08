package cn.itrover.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author itrover
 */
@Getter
@Setter
@ToString
public class Friend implements Cloneable, Serializable {

    private static final long serialVersionUID = 2L;

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
