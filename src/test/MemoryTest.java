package test;

public class MemoryTest {

    public static void main(String[] args) {
        long l = Runtime.getRuntime().maxMemory();
        long l2 = Runtime.getRuntime().totalMemory();
        int i = Runtime.getRuntime().availableProcessors();
//        System.out.println(l/1024/1024);
//        System.out.println(l2/1024/1024);

    }
}
