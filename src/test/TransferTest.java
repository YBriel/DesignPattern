package test;

public class TransferTest {

    public String setX(String s,String t){
        s="xxx";
        t="ttt";
        return s;
    }

    public static void main(String[] args) {
        String s="sss";
        TransferTest transferTest=new TransferTest();
        String s1=new String("t");
        transferTest.setX(s,s1);
        System.out.println(s);
        System.out.println(s1);
    }
}
