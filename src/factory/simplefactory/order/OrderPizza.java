package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //Pizza类型
    }

/*        do{
            orderType=getPizzaType();
            if(orderType.equals("greek")){
                pizza =new GreekPizza();
                pizza.setName("希腊pizza");
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("奶酪pizza");
            }else {
                break;
            }
            pizza.prepare();
            pizza.cut();
            pizza.bake();
            pizza.box();
        }while (true);
    }*/

    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        Pizza pizza=null;
        String orderType="";
        this.simpleFactory=simpleFactory;
        do {
            orderType=getPizzaType();
            pizza = this.simpleFactory.createPizza(orderType);
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


    public String getPizzaType(){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input you choice");
        String str= null;
        try {
            str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
