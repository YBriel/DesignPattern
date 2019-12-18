package builder.demo1;

public class CommonHouse extends AbsHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子盖屋顶");
    }
}
