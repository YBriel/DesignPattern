package memento;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   15:15
 */
public class Client {


    public static void main(String[] args) throws InterruptedException {
        GameRole gameRole=new GameRole();
        gameRole.inti();
        gameRole.show();
        gameRole.attackBoss();
        gameRole.show();
        RoleStateMemonto roleStateMemonto = gameRole.saveMemento();
        gameRole.attackBoss();
        gameRole.show();
        gameRole.recoverMemento(roleStateMemonto);
        gameRole.show();

    }

}
