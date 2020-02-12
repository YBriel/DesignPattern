package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:10
 */
public abstract class AbstractBaseFood {

    protected String kind;

    protected int num;

    protected float price;

    public float totalPrice() {
        return this.num * this.price;
    }
}
