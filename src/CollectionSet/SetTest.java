package CollectionSet;

import Collection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName CollectionTest
 * @Description: TODO
 * Set接口框架
 *          Collection接口：单列集合，用来存储一个一个的对象
 *               Set接口：存储无序的，不可重复的数据    --->   高中数学中的集合
 *                  HashSet：作为Set接口的主要实现类：线程不安全，可以存储null值
 *                      LinkHashSet：作为HashSet的子类：遍历其内部数据时，可按照添加的顺序遍历
 *                  TreeSet：可以按照添加对象的指定属性进行排序
 *
 *          Set接口中没有重新定义的方法，使用的都是Collection中声明过得方法
 *
 *          要求:向Set中添加的数据，其所在类一定要重写hashCode() 和 equals()
 *          要求:重写的hashCode()和equals()尽可能的保持一致性。
 *              重写小技巧:equals中用到的Field，都用来hashcode计算中。
 * @Authot li
 * @Date 2019/12/2
 * @Version v1.0
 **/

public class SetTest {


    /*
    以HashSet为例：底层实现也是数组
    1. 无序性
      不等于随机性，只是不是按照添加的顺序遍历
      存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的

    2.不可重复性：
    保证添加的元素按照equals()判断时，不能返回true，即相同的元素不能重复添加。


    HashSet添加元素的过程。
    我们想HashSet中添加元素a,首先调用元素a所在类的hashcode()方法，得到元素a的哈希值
    使用某种的特殊的算法，计算出哈希值的存储位置（即:索引位置），判断此位置上是否已经有元素：
       如果此位置上没有元素，那么添加成功。          情况1
       如果此位置上有元素b(或以链表形式存储的一系列元素)，则比较元素a与元素b的hash值是否相等:
          若不相等，那么添加成功                  情况2
          若相等，那么调用元素a所属类的equals方法：
             若返回true，那么添加元素a失败
             若返回false,那么添加元素a成功        情况3

     对于情况2和情况3而言:元素a与已经存在指定索引位置上的数据以链表的方式存储
     jdk7 元素a放在原始数组中，指向原来的元素
     jdk8 原来的元素b在数组中，执行元素a
     HashSet底层:  数组+链表
    * */


    @Test
    public void Test1(){
        Set set = new HashSet();
        set.add(111);
        set.add(222);
        set.add(333);
        set.add("AA");
        set.add(new Person("li",12));
        set.add(new Person("li",12));
        set.add(333);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet是HashSet的一个子类  优点：遍历方便
    //底层实现维护了一个链表数组
    //所以可以按照添加顺序遍历
    @Test
    public void Tes12(){
        Set set = new LinkedHashSet();
        set.add(111);
        set.add(222);
        set.add(333);
        set.add("AA");
        set.add(new Person("li",12));
        set.add(new Person("li",12));
        set.add(333);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
