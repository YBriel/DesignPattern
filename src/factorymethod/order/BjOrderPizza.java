package factorymethod.order;


import factorymethod.pizza.BjCheesePizza;
import factorymethod.pizza.BjPepperPizza;
import factorymethod.pizza.Pizza;

public class BjOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new BjCheesePizza();
        }else if(type.equals("pepper")){
            pizza=new BjPepperPizza();
        }
        return pizza;
    }
}
