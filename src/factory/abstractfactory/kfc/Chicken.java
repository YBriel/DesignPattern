package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:16
 */
public class Chicken extends AbstractBaseFood implements IFood {
    @Override
    public void printMessage() {
        System.out.println(this.kind+"风味鸡翅"+"\t单价: "+this.price+"\t数量  "+this.num+"\t总价为:"+this.totalPrice());
    }
}
