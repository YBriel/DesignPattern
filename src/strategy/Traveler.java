package strategy;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/25   10:06
 */
public class Traveler {

    private TravelStrategy travelStrategy;

 /*   public Traveler(TravelStrategy travelStrategy){
        this.travelStrategy=travelStrategy;
    }
*/
    public void chooseWay(String weather){
        switch (weather) {
            case "cloudy":
                travelStrategy = new BikeStrategy();
                break;
            case "sunny":
                travelStrategy = new BusStrategy();
                break;
            case "rainy":
                travelStrategy = new CarStrategy();
                break;
            default:
                System.out.println("天气输入错误");
                break;
        }
        if(travelStrategy!=null){
            travelStrategy.outWay();
        }
    }
}
