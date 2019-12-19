package decorate;

public class Client {

    public static void main(String[] args) {
        Drink drink = new LongBlack();
       // System.out.println("费用1="+drink.getPrice()+" 点了一份"+drink.getDesc());
        drink=new Chocolate(drink);
        drink=new Chocolate(drink);
        drink=new Chocolate(drink);
        System.out.println(drink.getPrice()+drink.getDesc());
    }
}
