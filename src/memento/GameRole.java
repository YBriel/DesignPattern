package memento;

import java.util.Date;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   15:15
 */
public class GameRole {

    private Date date;

    private int atk; //攻击力

    public void inti(){
        date=new Date();
        atk=100;
    }

    public void attackBoss() throws InterruptedException {
        date=new Date();
        atk=atk-10;
        Thread.sleep(1000);
    }

    public void show(){
        System.out.println("当前时间是"+date);
        System.out.println("当前攻击力是"+atk);
    }

    public RoleStateMemonto saveMemento(){
        return new RoleStateMemonto(date,atk);
    }

    public void recoverMemento(RoleStateMemonto memonto) throws InterruptedException {
        this.date=memonto.getDate();
        this.atk=memonto.getAtk();
        System.out.println("存档成功，攻击力为"+atk+"时间为"+date);
        Thread.sleep(1000);
    }
}
