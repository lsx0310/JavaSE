package ClassPackage.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName AdminServiceInvocation
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class AdminServiceInvocation implements InvocationHandler {

    private Object target;

    public AdminServiceInvocation(Object target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("判断用户是否拥有权限进行操作");
        Object obj = method.invoke(target);
        System.out.println("记录用户执行操作的用户信息，更改内容和时间等");
        return obj;
    }

}
