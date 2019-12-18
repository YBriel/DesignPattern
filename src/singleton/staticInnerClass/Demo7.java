package singleton.staticInnerClass;

/**
 * 使用静态内部类完成单例模式 推荐使用
 * 实现延迟加载
 * 安全
 */
public class Demo7 {

    public static void main(String[] args) {
        System.out.println("静态内部类单例");
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton==singleton1);
        System.out.println("instance1"+singleton.hashCode());
        System.out.println("instance2"+singleton1.hashCode());
    }
}

class Singleton{
    private static volatile Singleton instance;

    private Singleton(){

    }

    //静态内部类，有一个静态属性 Singleton
    //jvm装载类是安全的
    private static class  SingletonInstance{
       private static final Singleton INSTANCE=new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}