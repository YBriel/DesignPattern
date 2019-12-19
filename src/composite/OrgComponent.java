package composite;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   11:17
 */
public abstract class OrgComponent {

    private String name;
    private String desc;

    protected void add(OrgComponent orgComponent){
        throw new UnsupportedOperationException(); //抛出不支持操作的异常
    }

    protected void remove(OrgComponent orgComponent){
        throw new UnsupportedOperationException(); //抛出不支持操作的异常
    }

    public OrgComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected abstract void print();
}
