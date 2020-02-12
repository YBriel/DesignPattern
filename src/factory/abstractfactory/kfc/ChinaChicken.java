package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:18
 */
public class ChinaChicken extends Chicken {

    public ChinaChicken(int num){
        this.num=num;
        this.price=9.8f;
        this.kind="麻辣";
    }
}
