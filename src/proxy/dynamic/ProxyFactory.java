package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author： yuzq
 * @Description:
 * @Date: 2019/12/19   14:15
 */
public class ProxyFactory {

    //维护目标对象
    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){

        //loader
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("通过反射调用目标对象，jdk代理。。。");
                return method.invoke(target, args);
            }
        });
    }
}
