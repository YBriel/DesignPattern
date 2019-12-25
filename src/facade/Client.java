package facade;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   15:06
 */
public class Client {

    public static void main(String[] args) {
/*        Facad facad=new Facad(new Light(),new Tv());
        facad.open();
        facad.close();*/
        char ch1 = 'B'; char ch2 = 12;
        System.out.println("65和'A'是否相等？" + (66 == ch1));//true
        System.out.println("12和ch2是否相等？" + (12 == ch2));//true
    }
}
