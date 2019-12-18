package singleton.doubleCheck;

/**
 * 单例模式 双重检查 创建实例
 * volatile保证内存可见性
 * 内存可见性（Memory Visibility）：所有线程都能看到共享内存的最新状态。
 * <p>
 * 同步代码块效率低
 */
public class Singleton {

    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        // System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton6 {

    private static volatile Singleton6 instance;

    private Singleton6() {

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，也解决了懒加载问题 推荐使用
    public static synchronized Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}
