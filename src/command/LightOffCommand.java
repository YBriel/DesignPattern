package command;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   15:13
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver=lightReceiver;
    }

    public void setLightReceiver(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
