package ClassPackage.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxyTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class DynamicProxyTest {

    public static void main(String[] args){

        //方法一
        System.out.println("=======================方法一==================");
        AdminService adminService = new AdminServicelmp();
        System.out.println("代理的目标对象：" + adminService.getClass());

        AdminServiceInvocation adminServiceInvocation = new AdminServiceInvocation(adminService);

        AdminService proxy =
                (AdminService) new AdminServiceDynamicProxy(adminService,adminServiceInvocation).getPersonProxy();

        System.out.println("代理对象：" + proxy.getClass());

        final Object obj = proxy.find();
        System.out.println("find 返回对象 ：" + obj.getClass());
        System.out.println("=================================");
        proxy.update();


        //方法二
        System.out.println("=======================方法二==================");
        final AdminService target = new AdminServicelmp();
        System.out.println("代理的目标对象：" + target.getClass());

        AdminServiceInvocation invocation2 = new AdminServiceInvocation(adminService);

        AdminService proxy2 = (AdminService)
                Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),invocation2);

        System.out.println("代理对象：" + proxy2.getClass());

        Object obj2 = proxy.find();
        System.out.println("find 返回对象 ：" + obj2.getClass());
        System.out.println("=================================");
        proxy.update();

        //方法三
        System.out.println("=======================方法三==================");
        final AdminService adminService3 = new AdminServicelmp();
        final AdminService proxy3 = (AdminService) Proxy.newProxyInstance(adminService3.getClass().getClassLoader(), adminService3.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("判断用户是否有权限进行操作");
                        Object obj = method.invoke(adminService3,args);
                        System.out.println("记录用户执行操作的用户信息、更改内容和事件等");
                        return obj;
                    }
                });

        Object obj3 = proxy.find();
        System.out.println("find 返回对象 ：" + obj3.getClass());
        System.out.println("=================================");
        proxy.update();


    }
}
