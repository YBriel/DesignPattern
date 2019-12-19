package template;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:49
 */
public abstract class SoyMilk {

    final void make(){
        select();
        addIngredient();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步，选择新鲜豆浆...");
    }

    //添加不同配料
    abstract void addIngredient();

    void soak(){
        System.out.println("第三部，浸泡三小时");
    }

    void beat(){
        System.out.println("打碎黄豆");
    }
}
