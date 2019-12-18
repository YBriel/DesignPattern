package factory.factorymethod.order;


import factory.factorymethod.pizza.BjCheesePizza;
import factory.factorymethod.pizza.BjPepperPizza;
import factory.factorymethod.pizza.Pizza;

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
