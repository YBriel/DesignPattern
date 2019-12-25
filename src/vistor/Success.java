package vistor;

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给该歌手评价成功");
    }

    @Override
    public void getWomanResult(Women man) {
        System.out.println("女人给该歌手评价成功");
    }
}
