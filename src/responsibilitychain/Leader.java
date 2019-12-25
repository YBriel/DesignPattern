package responsibilitychain;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   11:00
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;

    public Leader(String name){
        super();
        this.name=name;
    }

    public void setNextLeader(Leader nextLeader){
        this.nextLeader=nextLeader;
    }

    protected abstract void doHandler(LeaveRequest leaveRequest) throws InterruptedException;
}
