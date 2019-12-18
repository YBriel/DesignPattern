package singleton.lazy;
/**
 * 单例模式 懒汉式 synchronized 解决线程不安全
 * 效率低
 */
public class Demo1Improve {
}
class Singleton1 {

    private static Singleton1 instance;

    //提供私有的构造
    private Singleton1() {

    }

    //提供一个静态公共方法，synchronized 解决线程不安全 使用时才去创建 ，懒汉式
    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}