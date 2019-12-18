package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊pizza");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪pizza");
            } else {
                System.out.println("工厂无此pizza");
            }
        return pizza;
    }
}
