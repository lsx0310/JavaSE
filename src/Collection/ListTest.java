package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description: TODO
 * List 接口中的  ArrayList LinkList  Vector
 * ArrayList 是List的主要实现类,底层是String[] 数组   线程不安全所以效率高
 * LinkList  是次要实现类,底层是双向链表
 * Vector 是古老的实现类，底层是String[] 数组         线程安全的，所有效率低
 *
 *
 * 源码分析：
 * jdk1.7  ArrayList
 * ArrayList list = new ArrayList()   底层创建了一个Object[] 长度为10的数组
 * 需要扩容的时候，会扩容为之前的1.5倍 newLength = oldLength + (oldLength >> 1)
 * 建议：开发中在知道数组长度时，直接传参  ArrayList list = new ArrayList(int capacity)
 *
 * jdk1.8  ArrayList
 * ArrayList list = new ArrayList()  底层Object[] 初始化为{} 并没有创建长度为10的数组
 * 在第一次添加数据时，底层才创建了长度为10的数组
 *
 * 后续添加和扩容操作与jdk1.7无异
 *
 * 小结：1.7中创建数组类似于单例模式中的饿汉模式，
 *      1.8中创建数组类似于单例模式中的懒汉模式  节省了内存
 *
 * jdk1.7 jdk1.8 中LinkList无异
 * LinkList list = new LinkList() 底层构建了一个Node类型的first和last属性，默认为null
 * list.add(123)  将123 封装到Node中，创建了Node对象
 *
 * @Authot li
 * @Date 2019/11/27
 * @Version v1.0
 **/

public class ListTest {


    @Test
    public void Test1(){
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add("AA");
        list.add(new Person("li",12));
        list.add(333);

        System.out.println(list);

        List list1 = Arrays.asList(1,2,3);
        //list.add(list1);  将list1 整体作为一个元素  想当于python中的append
        //list.addAll(list1); 将list1中的元素逐一添加到list中  相当于python中的extend
        System.out.println(list);
    }

    @Test
    public void Test2(){
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add("AA");
        list.add(new Person("li",12));
        list.add(333);

        System.out.println(list.indexOf(333));         //返回第一个下标   没有返回-1
        System.out.println(list.lastIndexOf(333));  //返回最后一个下标  没有返回-1
        System.out.println(list.get(4));

        Object obj = list.remove(2);             //按照索引删除
        System.out.println(obj);
        Object obj1 = list.set(2,333);
        System.out.println(list);

        List subList = list.subList(2,4);
        System.out.println(subList);
    }

    @Test
    public void Test3(){
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add("AA");
        list.add(new Person("li",12));
        list.add(333);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object obj : list){
            System.out.println(obj);
        }

        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
