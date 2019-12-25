package factorymethod.pizza;

public class BjCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("正在准备北京奶酪pizza");
    }
}
