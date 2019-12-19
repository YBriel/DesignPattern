package flyweight;

import java.util.HashMap;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   13:37
 */
public class WebsiteFactory {

    //集合充当池的左右

    private HashMap<String,ConcreteWebsite> pool=new HashMap<>();

    //根据网站类型返回一个网站，如果没有就创建一个网站并放入到池中

    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));

        }
        return pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }
}
