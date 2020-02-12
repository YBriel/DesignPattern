package factory.simplefactory;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:05
 */
public class SwordImpl implements ISwordFactory {
    @Override
    public AbstractFactory createSword() {
        return new Sword();
    }
}
