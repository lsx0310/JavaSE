package ClassPackage.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ProxyTest
 * @Description: TODO  没搞懂代理干撒的
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class ProxyTest {

    public static void main(String[] args){
        Object[] elements = new Object[1000];

        //fill elements with proxies for the integers 1...1000
        for (int i = 0;i < elements.length;i++){
            Integer vaule = i + 1;
            InvocationHandler handler = new TraceHandler(vaule);
            Object proxy = Proxy.newProxyInstance(null,new Class[] {Comparable.class},handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        int result = Arrays.binarySearch(elements,key);

        if (result >= 0) System.out.println(elements[result]);
    }
}


class TraceHandler implements InvocationHandler{
    private Object target;

    /**
    * Constructs a TraceHandler
     * @param target the implicit parameter of the method call
     * */
    TraceHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method m,Object[] args) throws Throwable{
        //print implicit argument
        System.out.print(this.target);

        //print method name
        System.out.println("." + m.getName() + "(");


        //print explicit arguments
        if (args != null){
            for (int i=0;i<args.length;i++){
                System.out.print(args[i]);
                if (i < args.length-1) System.out.println(",");
            }
        }
        System.out.println(")");

        //invoke actual method
        return m.invoke(target,args);
    }
}
