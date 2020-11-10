package cn.itrover.designpattern.builder;

/**
 * 产品
 */
public class Phone {
    private String core;
    private String screen;
    private String camera;

    @Override
    public String toString() {
        return "M{" +
                "core='" + core + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
