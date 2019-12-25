package test;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   14:59
 */
public class TestDemo1 {

    private String name;
    private String des;

    private void init(){
        name="tom";
        des="hhh";
    }

    public static void main(String[] args) {
        TestDemo1 testDemo=new TestDemo1();
        System.out.println(testDemo.des);
        System.out.println(testDemo.name);
        testDemo.init();
        System.out.println("---->");
        System.out.println(testDemo.des);
        System.out.println(testDemo.name);
    }
}
