package adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int src=output220v();
        int i = src / 44;
        System.out.println("经过适配器输出电压为"+i);
        return i;
    }
}
