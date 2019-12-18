package singleton.lazy;
/**
 * 单例模式 懒汉式 同步代码块 方式不能解决问题，线程不安全
 * 开发时不能用，有线程安全
 */
public class Demo3 {
}

class Singleton3 {

    private static Singleton3 instance;

    //提供私有的构造
    private Singleton3() {

    }

    //提供一个静态公共方法，synchronized 同步代码块，多线程时有问题 使用时才去创建 ，懒汉式
    public static  Singleton3 getInstance() {
        if (instance == null) {
           synchronized (Singleton3.class){
               instance = new Singleton3();
           }
        }
        return instance;
    }
}