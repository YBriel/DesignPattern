package proxy.dynamic;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:23
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        TeacherDao teacherDao1 = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
