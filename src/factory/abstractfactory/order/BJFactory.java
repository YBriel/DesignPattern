package factory.abstractfactory.order;

import factory.abstractfactory.pizza.BjCheesePizza;
import factory.abstractfactory.pizza.BjPepperPizza;
import factory.abstractfactory.pizza.Pizza;

public class BJFactory implements AbsFactory{


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new BjCheesePizza();
        }else if(type.equals("pepper")){
            pizza=new BjPepperPizza();
        }
        return pizza;
    }
}
