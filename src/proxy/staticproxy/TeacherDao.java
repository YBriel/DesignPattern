package proxy.staticproxy;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:04
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
