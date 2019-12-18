package builder.demo2;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HighBuilding hb=new HighBuilding();
        HouseDirector houseDirector = new HouseDirector(hb);
        House house = houseDirector.constructHouse();
        System.out.println(house.getBasie());
    }
}
