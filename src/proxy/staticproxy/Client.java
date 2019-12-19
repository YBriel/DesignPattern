package proxy.staticproxy;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:09
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy=new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
