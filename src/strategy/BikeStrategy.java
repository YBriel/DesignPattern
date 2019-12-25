package strategy;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   10:03
 */
public class BikeStrategy implements TravelStrategy {

    @Override
    public void outWay() {
        System.out.println("使用开车出行...");
    }
}
