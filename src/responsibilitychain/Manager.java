package responsibilitychain;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    protected Map<String, String> doHandlerBack(LeaveRequest leaveRequest) {
        Map<String,String> map=new HashMap<>();
        System.out.println(this.name+"第二步--正在进行微信支付");
        if(leaveRequest.getDays()>20){
            map.put("reason","支付金额大于20元，微信金额不足以支付，订单支付失败！");
            System.out.println("支付金额大于20元，微信金额不足以支付，订单支付失败！");
            return this.nextLeader.doHandlerBack(leaveRequest);
        }
        System.out.println(this.name+"大于10块小于二十块微信金额足够支付！");
        map.put("reason","介于10-20支付成功！");
        return map;
    }
}
