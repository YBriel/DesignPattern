package builder.demo3;

public abstract class Builder {

    public abstract void  buildCpu(String a);
    public abstract void  buildGpu(String a);
    public abstract void  buildRam(String a);
    public abstract void  buildRom(String a);
    public abstract Computer getComputer();
}
