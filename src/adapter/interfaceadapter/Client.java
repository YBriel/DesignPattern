package adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter=new AbsAdapter() {

            @Override
            public int getdemo1() {
                return 0;
            }
        };
        absAdapter.getdemo1();
    }
}
