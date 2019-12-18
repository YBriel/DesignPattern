package builder.demo2;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasie("good basic");
        System.out.println("别墅地基");
    }

    @Override
    public void buildWall() {
        house.setWall("good wall");
        System.out.println("别墅墙");
    }

    @Override
    public void buildRoof() {
        house.setRoof("good roof");
        System.out.println("别墅屋顶");
    }
}
