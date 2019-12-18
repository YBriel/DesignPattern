package builder.demo1;

public abstract class AbsHouse {

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    public void build(){
        buildBasic();
        buildWall();
        buildRoof();
    }
}
