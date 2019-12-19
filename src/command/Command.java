package command;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   15:07
 */
public interface Command {

    public void execute();

    public void undo();
}
