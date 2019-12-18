package adapter.objeecadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("使用对象适配器进行充电");
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
