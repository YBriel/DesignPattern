package factory.simplefactory.order;

/**
 * Pizza店完成Pizza的订购
 */
public class PizzaStore {

    public static void main(String[] args) {
       // OrderPizza orderPizza=new OrderPizza();
     new OrderPizza(new SimpleFactory());

    }
}
