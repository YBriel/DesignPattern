package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

/**
 * 抽象工厂模式抽象层
 */
public interface AbsFactory {

    //给工厂子类具体实现
     Pizza createPizza(String type);
}
