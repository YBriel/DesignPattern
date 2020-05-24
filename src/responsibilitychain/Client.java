package responsibilitychain;

import java.util.Map;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   11:14
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Leader directorManager = new DirectorManager("张三");
//        Leader manager = new Manager("傻逼");
//        Leader boss = new Boss("李白");
//        directorManager.setNextLeader(manager);
//        manager.setNextLeader(boss);
/*        LeaveRequest request = new LeaveRequest("胡思远", "十黑", 30);
        directorManager.doHandler(request);*/

        LeaveRequest request1 = new LeaveRequest("胡思远", "十黑", 39);

        Map<String, String> map = directorManager.doHandlerBack(request1);
        System.out.println(map);


    }
}
