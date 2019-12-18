package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

   private AbsFactory absFactory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza=null;
        String orderType="";
        this.absFactory=absFactory;

        do{
             orderType=getPizzaType();
             pizza=absFactory.createPizza(orderType);
             if(pizza!=null){
                 pizza.prepare();
                 pizza.bake();
                 pizza.cut();
                 pizza.box();
             }else {
                 System.out.println("订购失败");
                 break;
             }
        }while (true);
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
