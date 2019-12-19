package flyweight;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   13:35
 */
public class ConcreteWebsite extends Website {

    private String type="";

    public ConcreteWebsite(String type){
        this.type=type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为"+type);
    }
}
