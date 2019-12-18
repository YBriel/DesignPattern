package factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("正在准备Greek Pizza材料...");
    }
}
