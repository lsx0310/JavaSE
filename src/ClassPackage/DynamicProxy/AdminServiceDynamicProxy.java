package ClassPackage.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName AdminServiceDynamicProxy
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class AdminServiceDynamicProxy {

    private Object target;
    private InvocationHandler invocationHandler;

    public AdminServiceDynamicProxy(Object target, InvocationHandler invocationHandler) {
        this.target = target;
        this.invocationHandler = invocationHandler;
    }

    public Object getPersonProxy(){
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),invocationHandler);
        return obj;
    }
}
