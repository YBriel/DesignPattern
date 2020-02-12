package factory.abstractfactory.kfc;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:19
 */
public interface IKfcFactory {

    Hunber createHamburg(int num);

    Chicken createChicken(int num);
}
