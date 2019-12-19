package composite;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   11:35
 */
public class Department extends OrgComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
