package builder.demo2;

/**
 * 建造流程写清楚
 */
public abstract class HouseBuilder {

    protected House house=new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    //建造房子 将产品返回
    public House buildHouse(){
        return house;
    }
}
