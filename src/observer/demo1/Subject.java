package observer.demo1;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/24   10:44
 */
public interface Subject {

    void registe(Observer o);

    void remove(Observer o);

    void notifyObserver();
}
