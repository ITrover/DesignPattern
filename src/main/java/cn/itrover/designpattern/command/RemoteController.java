package cn.itrover.designpattern.command;

import java.util.HashMap;


/**
 * 控制器
 */
public class RemoteController {

    private HashMap<String,Command> onCommand = new HashMap <>();

    private HashMap<String,Command> offCommand = new HashMap <>();

    private Command undo;

    public void setCommand(String name, Command on,Command off){

        onCommand.put(name,on);
        offCommand.put(name,off);

    }

    public void on(String name){
        Command on = onCommand.get(name);
        if (on != null) {
            on.execute();
            undo = on;
        }
    }

    public void off(String name){
        Command off = offCommand.get(name);
        if (off != null){
            off.execute();
            undo = off;
        }
    }

    public void undo(){
        if(undo != null){
            undo.undo();
            // 撤销后不支持再撤销
            undo = null;
        }
    }

}
