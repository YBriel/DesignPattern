package factory.simplefactory;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:06
 */
public class SwordMain {

    public static void main(String[] args) {
        ISwordFactory sword = new SwordImpl();
        AbstractFactory sword1 = sword.createSword();
        System.out.println(sword1.getName());
    }
}
