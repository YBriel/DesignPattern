package facade;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   15:06
 */
public class Client {

    public static void main(String[] args) {
        Facad facad=new Facad(new Light(),new Tv());
        facad.open();
        facad.close();
    }
}
