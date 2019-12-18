package factory.factorymethod.order;


import factory.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(type.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
