package builder.demo2;

/**
 * concreteBuilder 具体建造者
 */
public class CommonHouse  extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasie("normal basic");
        System.out.println("普通房子地基");
    }

    @Override
    public void buildWall() {
        house.setRoof("normal roof");
        System.out.println("普通房子地基");
    }

    @Override
    public void buildRoof() {
        house.setWall("normal wall");
        System.out.println("普通房子屋顶");
    }
}
