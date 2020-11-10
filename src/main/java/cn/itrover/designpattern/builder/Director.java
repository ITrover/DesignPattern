package cn.itrover.designpattern.builder;

/**
 * 指挥者
 */
public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 流程交给指挥者
     * @return
     */
    public Phone createPhone(){
        builder.camera();
        builder.core();
        builder.screen();
        return builder.build();
    }

}
