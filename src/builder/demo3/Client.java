package builder.demo3;

public class Client {

    public static void main(String[] args) {
        ComputerBuilder builder=new ComputerBuilder(new Computer());
        builder.buildCpu("cpu啊");
        builder.buildGpu("gpu980");
        System.out.println(builder.getComputer());
    }
}
