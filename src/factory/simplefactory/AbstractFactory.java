package factory.simplefactory;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/12   10:02
 */
public abstract class AbstractFactory {

    private String name;

    public AbstractFactory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
