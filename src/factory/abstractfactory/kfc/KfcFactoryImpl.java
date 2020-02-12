package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:20
 */
public class KfcFactoryImpl implements IKfcFactory {
    @Override
    public Hunber createHamburg(int num) {
        return new ChinaHunber(num);
    }

    @Override
    public Chicken createChicken(int num) {
        return new ChinaChicken(num);
    }
}
