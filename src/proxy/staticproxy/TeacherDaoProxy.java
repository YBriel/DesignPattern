package proxy.staticproxy;

/**
 * @Author： yuzq
 * @Description: 静态代理
 * @Date: 2019/12/19   14:05
 */
public class TeacherDaoProxy implements ITeacherDao{


    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target){
        this.target=target;
    }

    @Override
    public void teach() {
        //可以做其他事务，例如开始事务
        System.out.println("代理开始...");
        target.teach();
        System.out.println("代理结束...");
    }
}
