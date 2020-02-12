package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:12
 */
public class Hunber extends AbstractBaseFood  implements IFood{

    @Override
    public void printMessage() {
        System.out.println(this.kind+"风味汉堡"+"\t单价: "+this.price+"\t数量  "+this.num+"\t总价为:"+this.totalPrice());
    }
}
