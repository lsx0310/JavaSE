package MapTest;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName MapTest
 * @Description:
 * Map : 双列数据存储k-y的数据
 *       HashMap:作为Map的主要实现类,线程不安全，效率高，可存储null的key和value
 *           LinkedHashMap:保证在遍历Map的时候，按照添加的顺序进行遍历。
 *               原因:在原有的HashMap底层结构的基础上，使用的链表
 *               对于频繁的遍历操作，此类执行效率高于HashMap
 *       TreeMap:保证按照添加key-value对进行排序（按照key的顺序），实现排序遍历。此时可怜key的自然排序或者定制排序
 *               底层使用红黑树
 *       Hashtable：古老的实现类，线程安全，效率低，不可存储null的key和value
 *           Properties:主要用于配置文件，key 和 value都是String类型
 *
 *
 *
 *      HashMap 的底层 ： 数组 + 链表 （jdk7）
 *                      数组  +  链表  +  红黑树  （jdk8）
 *
 *      面试题:
 *      HashMap的底层实现原理
 *      HashMap 和 Hashtable的异同
 *      CurrentHashMap  与 Hashtable 的异同
 *
 *
 *      Map结构的理解：
 *      Map中的key:无序的，不可重复的 可以认为是用set存储的    key 所在的类要重写equals 和 hashCode()  （以HashMap为例，TreeMap
 *                跟TreeSet类似）
 *      Map中的value：无序的，可重复的，可以认为是用Collection存储的，  value所在类实现equals
 *      一个键值对：key-value构成了一个Entry对象
 *      Map中的entry：无序的，不可重复的，使用Set对象存储Entry
 *
 *
 *      HashMap的底层实现原理？
 *      以jdk7为例：
 *      HashMap map = new HashMap():
 *      在实例化以后，底层创建了长度时16的一维数组Entry[] table
 *
 *      map.put(key1,value1)
 *      首先，调用key1所在类的hashCode()计算key1的哈希值，此哈希值经过特殊的算法计算以后，得到在Entry数组的中存放位置
 *      如果此位置上的数据为空，此时的key1-value1添加成功            ------情况1
 *      如果此位置上的数据不为空，比较key1和已经存在的一个或多个数据（以链表形式存在）的哈希值：
 *         如果key1的哈希值与已经存在的数据的哈希值都不相同，此时key1-values添加成功。           ------情况2
 *         如果key1的哈希值与已经存在的数据中某个key的哈希值相同，继续比较，调用key1所在类的equals(key2)
         *      如果返回false  那么以链表的形式将key1-values存放进去               ----情况3
         *      如果返回true   那么把原来key对象的value值更改为value1。
 *
 *
 *      补充：关于情况2和情况3：此时key1-value1和原来的数据以链表的方式存储
 *
 *      在不断添加的过程中，当数组的长度超过临界值时（且此地址上已经有Node）会涉及到扩容的问题，默认的扩容方式:扩容为原来容量的2倍，并将原有的数据复制过来
 *
 *      jdk8原理：
 *      在new HashMap()时 并没有立刻创建一个长度为16的Node[] 数组（与Entry[]数组相同）
 *      在put第一个的Node时才创建一个Node[]数组
 *      jdk8在经过计算后的位置上如果链表的长度 > 8 && 整个数组的长度 > 64 那么底层变形为红黑树存储，便于查找。
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class MapTest {


    @Test
    public void Test1(){

        HashMap map = new HashMap();

        map.put("AA",123);
        map.put("BB",234);
        map.put("CC",345);
        map.put("AA",111);

        System.out.println(map);

        HashMap map1 = new HashMap();
        map1.put("BB",222);

        map.putAll(map1);
        System.out.println(map);

        Object removeValue = map.remove("AA");
        System.out.println(removeValue);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());

    }


    @Test
    public void Test2(){
        HashMap map = new HashMap();

        map.put("AA",123);
        map.put("BB",234);
        map.put("CC",345);
        map.put("AA",111);

        Object getValue = map.get("AA");
        System.out.println(getValue);

        System.out.println(map.containsKey("AA"));
        System.out.println(map.containsValue(123));
        System.out.println(map.size());
        System.out.println(map.equals("123"));

        Set keySet = map.keySet();
        System.out.println(keySet);

        Collection valueCollection = map.values();
        System.out.println(valueCollection);

        Set entrySet = map.entrySet();
        System.out.println(entrySet);

    }
}
