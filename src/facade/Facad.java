package facade;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   15:04
 */
public class Facad {

    private Light light;
    private Tv tv;

    public Facad (Light light,Tv tv){
        this.light=light;
        this.tv=tv;
    }
    public void open(){
        light.open();
        tv.open();
    }

    public void close(){
        light.close();
        tv.close();
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }
}
