package cn.itrover.designpattern.command;


/**
 * 具体关命令
 */
public class LightOffCommand implements Command {

    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }

}
