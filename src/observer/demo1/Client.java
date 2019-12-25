package observer.demo1;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   10:58
 */
public class Client {

    public static void main(String[] args) {
        //Subject subject=new
        User zs=new User("张三");
        User ls=new User("李四");
        User ww=new User("王五");

        MsgServer subject=new MsgServer();
        subject.registe(zs);
        subject.registe(ls);
        subject.registe(ww);
        subject.setInfomation("我日照香炉生紫烟");
        System.out.println("=====>");
        subject.remove(zs);
        subject.setInfomation("我草长莺飞二月天");

    }
}
