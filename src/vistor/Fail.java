package vistor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人失败");
    }

    @Override
    public void getWomanResult(Women man) {
        System.out.println("女人失败");
    }
}
