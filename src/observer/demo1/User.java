package observer.demo1;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   10:54
 */
public class User implements Observer {
    private String name;

    private String msg;

    public User(String name){
        this.name=name;
    }

    @Override
    public void update(String msg) {
        this.msg=msg;
        read();
    }

    private void read(){
        System.out.println(name+"收到消息"+msg);
    }
}
