package factory.abstractfactory.pizza;

public class BjPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("正在准备北京胡椒pizza");
    }
}
