package composite;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   11:45
 */
public class Client {

    public static void main(String[] args) {
        OrgComponent university=new University("南昌大学","垃圾大学");

        OrgComponent computer = new Colleage("软件学院", "软件学院的");
        OrgComponent info = new Colleage("信息工程", "信息工程的");

        computer.add(new Department("软件工程","软件工程"));
        computer.add(new Department("软件工程1","软件工程1"));

        info.add(new Department("通信工程","信工"));
        info.add(new Department("信息工程","信息"));

        university.add(computer);
        university.add(info);

        university.print();

    }
}
