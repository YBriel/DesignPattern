package factory.abstractfactory.order;

import factory.abstractfactory.pizza.LDCheesePizza;
import factory.abstractfactory.pizza.LDPepperPizza;
import factory.abstractfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(type.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
