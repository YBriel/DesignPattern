package vistor;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        ObejectStructure structure=new ObejectStructure();
        structure.attach(new Man());
        structure.attach(new Women());
        structure.display(new Success());
    }
}
