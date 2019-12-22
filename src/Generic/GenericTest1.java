package Generic;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

import javax.print.attribute.standard.OrientationRequested;
import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericTest1
 * @Description: 自定义泛型类使用  及子类继承泛型类使用
 * @Authot li
 * @Date 2019/12/17
 * @Version v1.0
 **/

public class GenericTest1 {

    @Test
    public void Test1(){

        //在创建泛型类的实例时，若不指明实现的具体泛型，则默认为Object
        //尽量指定具体的泛型
        Order order1 = new Order();
        order1.getOrderT();
        order1.setOrderT(123);
        order1.setOrderT("TTT");


        //推荐
        Order<String> order2 = new Order<>();

        order2.getOrderT();
        order2.setOrderT("AAA");//指定泛型为String
    }



    @Test
    public void Test2(){
        SubOrder subOrder1 = new SubOrder();


        //extend时 直接指定了泛型类型为Integer 定义时就不用指明了
        subOrder1.setOrderT(123);
    }


    @Test
    public void Test3(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //泛型不同的两个引用不能相互赋值
        //list1 = list2 error!
    }


    //测试泛型类中的泛型方法
    @Test
    public void Test4(){
        Order<String> order = new Order<>();


        Integer[] arr = new Integer[]{1,2,3,4};
        //方法中的泛型类型与所在类没有任何关系
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
    }
}
