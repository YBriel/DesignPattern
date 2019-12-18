package factory.factorymethod.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LD胡椒pizza");
        System.out.println("正在准备LD胡椒pizza");
    }
}
