package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   11:24
 */
public class University extends OrgComponent {


    private List<OrgComponent> orgComponents=new ArrayList<OrgComponent>();
    @Override
    protected void print() {
        System.out.println("学校的名字"+getName());
        for(OrgComponent orgComponent:orgComponents){
            orgComponent.print();
        }
    }

    @Override
    protected void add(OrgComponent orgComponent) {
        orgComponents.add(orgComponent);
    }

    @Override
    protected void remove(OrgComponent orgComponent) {
        orgComponents.remove(orgComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    public University(String name, String desc) {
        super(name, desc);
    }
}
