package adapter.objeecadapter;

public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5V() {
        int dst=0;
        if(null!=voltage220V){
            int src=voltage220V.output220v();
            System.out.println("适配器转换");
            dst=src/44;
            System.out.println("适配完成");
        }
        return dst;
    }
}
