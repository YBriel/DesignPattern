package responsibilitychain;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   11:27
 */
public class Boss extends Leader {


    public Boss(String name) {
        super(name);
    }

    @Override
    protected void doHandler(LeaveRequest leaveRequest) throws InterruptedException {
        System.out.println(this.name+"正在审批");
        if (leaveRequest.getDays() <= 10) {
            System.out.println(leaveRequest.getName() + "因为" + leaveRequest.getReason() + "请假" + leaveRequest.getDays() + "天" + this.name + "，批准");
            System.out.println("审批通过");
            System.out.println("祝你假期愉快！");
        } else {
            System.out.println("请你麻痹呢？请这么久？");
            Thread.sleep(1000);
            System.out.println("给你三秒钟考虑...");
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("跟财务对接下，明天滚蛋！");
        }
    }
}
