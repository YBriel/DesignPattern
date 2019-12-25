package observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   10:47
 */
public class MsgServer implements Subject {

    private List<Observer> list;
    private String msg;

    private Observer observer;

    public MsgServer(){
        list= new ArrayList<>();
    }

    @Override
    public void registe(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        if(list.size()>1){
            list.remove(o);
        }else {
            System.out.println("删除失败!");
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(msg);
        }
    }

    public void setInfomation(String s) {
        this.msg = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
