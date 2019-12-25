package bridge.demo2;

public class Clienter {

    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.bridge=new AreaB3();
        a.fromAreaA();
        a.bridge.targetAreaB();
    }
}


