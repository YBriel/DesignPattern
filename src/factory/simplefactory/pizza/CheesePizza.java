package factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备奶酪Pizza材料...");
    }
}
