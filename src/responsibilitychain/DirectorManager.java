package responsibilitychain;

/**
 * @Author： yuzq
 * @Description: 经理
 * @Date: 2019/12/25   11:04
 */
public class DirectorManager extends Leader{

    public DirectorManager(String name) {
        super(name);
        this.nextLeader=new Manager("张珊珊");
    }

    @Override
    protected void doHandler(LeaveRequest leaveRequest) throws InterruptedException {
        System.out.println(this.name+"正在审批");
        if(leaveRequest.getDays()<=1){
            System.out.println(leaveRequest.getName()+"因为"+leaveRequest.getReason()+"请假"+leaveRequest.getDays()+"天"+this.name+"，批准");
            System.out.println("审批通过！");
        }else {
            if(super.nextLeader!=null){
                System.out.println(leaveRequest.getName()+"因为"+leaveRequest.getReason()+"请假"+leaveRequest.getDays()+"天");
                System.out.println("请假天数大于1天，需要主管审批");
                Thread.sleep(1000);
                System.out.println("正在提交给主管....");
                Thread.sleep(1000);
                this.nextLeader.doHandler(leaveRequest);
            }
        }
    }
}
