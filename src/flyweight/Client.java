package flyweight;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   13:41
 */
public class Client {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory=new WebsiteFactory();

        Website use = websiteFactory.getWebsiteCategory("新闻");

        use.use();
    }
}
