package Collections;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsTest
 * @Description: TODO
 * Collections 操作 Collection 和 Map
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class CollectionsTest {

    /*
    *
    * reverse(List):反转List中元素的顺序
    * shuffle(List):对List集合元素进行随机排序
    * sort(List):根据元素的自然顺序对指定List集合元素按升序排序
    * sort(List,Comparator):根据指定的Comparator 产生的顺序对List集合元素进行排序
    * swap(List,int,int):将指定list集合中的i处元素和j处元素进行交换
    *
    *
    * Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
    * Object max(Collection,Comparator):根据Comparator指定的顺序，返回给定结合中的最大元素
    * Object min(Collection)
    * Object min(Collection Comparator)
    * int frequency(Collection,Object) :返回指定集合中指定元素出现的次数
    * void copy(List dest,List src):将src中的内容复制到dest中
    * boolean replaceAll(List list,Object oldVal,Object newVal):使用新值替换List对象的所有旧值
    * */

    @Test
    public void Test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(4456);
        list.add(0);

        System.out.println(list);
        Collections.swap(list,0,1);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //copy使用
//        ArrayList list1 = new ArrayList();
//        //java.lang.IndexOutOfBoundsException: Source does not fit in dest
//        Collections.copy(list1,list);

        //正确使用方式
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);



        /*
        * Collections  类中提供了多个synchronizedXxx() 方法
        * 该方法可使将指定集合包装成线程同步的集合，从而可以可以解决多线程并发访问集合时的线程安全问题*/


    }
}
