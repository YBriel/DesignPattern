package builder.demo3;

public class ComputerBuilder extends Builder {

    private Computer computer;

    public ComputerBuilder(Computer computer){
        this.computer=computer;
    }
    @Override
    public void buildCpu(String a) {
        computer.setCpu(a);
    }

    @Override
    public void buildGpu(String a) {
        computer.setGpu(a);
    }

    @Override
    public void buildRam(String a) {
        computer.setRam(a);
    }

    @Override
    public void buildRom(String a) {
        computer.setRom(a);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
