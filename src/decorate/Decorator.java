package decorate;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+ drink.cost();
    }

    @Override
    public float getPrice() {
        return super.getPrice()+drink.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+drink.getDesc();
    }
}
