package factorymethod.order;


import factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    abstract Pizza createPizza(String type);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getPizzaType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }


    public String getPizzaType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input you choice");
        String str = null;
        try {
            str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
