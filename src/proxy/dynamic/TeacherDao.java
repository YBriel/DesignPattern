package proxy.dynamic;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:14
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("动态代理授课中...");
    }
}
