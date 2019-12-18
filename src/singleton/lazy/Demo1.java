package singleton.lazy;

/**
 * 单例模式 懒汉式 线程不安全
 */
public class Demo1 {

}
class Singleton{

    private static Singleton instance;

    //提供私有的构造
    private Singleton(){

    }

    //提供一个静态公共方法，使用时才去创建 ，懒汉式
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
