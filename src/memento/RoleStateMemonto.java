package memento;

import java.util.Date;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   15:19
 */
public class RoleStateMemonto {

    private Date date;

    private int atk; //攻击力

    public RoleStateMemonto(Date date,int atk){
        this.atk=atk;
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
