package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:22
 */
public class Customer {

    private IKfcFactory factory;

    public Customer(IKfcFactory factory){
        this.factory=factory;
    }

    public float orderHumberg(int num){
        Hunber hamburg = factory.createHamburg(num);
        hamburg.printMessage();
        return hamburg.totalPrice();
    }

    public float orderChinaChicken(int num){
        Chicken chicken = factory.createChicken(num);
        chicken.printMessage();
        return chicken.totalPrice();
    }
}
