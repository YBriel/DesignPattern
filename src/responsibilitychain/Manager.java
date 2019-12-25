package responsibilitychain;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   11:10
 */
public class Manager extends Leader {

    public Manager(String name){
        super(name);
        this.nextLeader=new Boss("副总");
    }

    @Override
    protected void doHandler(LeaveRequest leaveRequest) throws InterruptedException {
        System.out.println(this.name+"正在审批");
        if(leaveRequest.getDays()<=3){
            System.out.println(leaveRequest.getName()+"因为"+leaveRequest.getReason()+"请假"+leaveRequest.getDays()+"天"+this.name+"，批准");
            Thread.sleep(1000);
            System.out.println("审批通过！");
        }else {
            if(this.nextLeader!=null){
                System.out.println("请假天数大于3天，需要副总审批");
                this.nextLeader.doHandler(leaveRequest);
            }
        }
    }
}
