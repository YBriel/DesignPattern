package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:19
 */
public class KfcMain {

    public static void main(String[] args) {
        IKfcFactory factory=new KfcFactoryImpl();

        Customer customer=new Customer(factory);

        float chicken = customer.orderChinaChicken(4);
        float hamburg = customer.orderHumberg(2);
        System.out.println("总计："+(chicken+hamburg));
    }
}
