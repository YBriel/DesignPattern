package singleton.hungry;

/**
 * 饿汉式 静态代码块方式创建单例模式
 * 1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同
 * 步问题。
 * 2) 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始
 * 至终从未使用过这个实例，则会造成内存的浪费
 * 3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载
 * 时就实例化，在单例模式中大多数都是调用getInstance方法， 但是导致类装载
 * 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类
 * 装载，这时候初始化instance就没有达到lazy loading的效果
 * 4) 结论：这种单例模式 可用， 可能造成内存浪费
 */
public class Demo2 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
       // System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

class Singleton2{

    private Singleton2(){

    }
    private static Singleton2 singleton2;
    static {
        singleton2 =new Singleton2();
    }

    public static Singleton2 getInstance(){
        return singleton2;
    }
}
