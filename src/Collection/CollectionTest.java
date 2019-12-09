package Collection;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName PersonTest
 * @Description: TODO  向Collection接口中实现类的对象添加Object对象时，需要重写它的equals
 * @Authot li
 * @Date 2019/11/23
 * @Version v1.0
 **/

public class CollectionTest {

    @Test
    public void test1(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("liming");
        coll.add(new StringBuffer("123"));
        coll.add(new Person("li",23));
        coll.add(false);


        //1.contains(Object obj): 判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        System.out.println("Collection int contains: " + coll.contains(123));

        System.out.println("Collection String contains: " + coll.contains("liming"));

        //重写Person的equals方法让其相等
        System.out.println("Collection Object contains: " + coll.contains(new Person("li",23)));

        System.out.println("Collection Object contains: " + coll.contains("123"));

        System.out.println("Collection false contains :" + coll.contains(false));

        //2.containsAll(Collection coll1) :判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,new Person("li",23));
        System.out.println("Collection containsAll :" + coll.containsAll(coll1));


    }

    @Test
    public void test2(){
        //remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new StringBuffer("123"));
        coll.add(new Person("li",23));
        coll.add(false);

        System.out.println(coll);


        System.out.println("Collection remove 123 :" + coll.remove(123)) ;
        System.out.println("Collection remove obj :" + coll.remove(new Person("li",23)));

        //removeAll(Collection coll1)从当前集合移除coll1中所有元素

        Collection coll1 = Arrays.asList(4456,1234);

        coll.removeAll(coll1);
        System.out.println("coll 移除后的数据:" + coll);

    }

    @Test
    public void test3(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add(44563);
        coll.add("liming");
//        coll.add(new StringBuffer("123"));  //添加StringBuffer 后未改写它的equals所以不相等
        coll.add(new Person("li",23));
        coll.add(false);


        //retainAll 求两个集合的交集，并返回给当前集合（保留一样的，删除不一样的）
//        Collection coll1 = Arrays.asList(123,456,789);
////        coll.retainAll(coll1);
////        System.out.println(coll);

        //equals(Object obj)
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(4456);
        coll2.add(44563);
        coll2.add("liming");
        //添加StringBuffer 后未改写它的equals所以不相等
        // coll2.add(new StringBuffer("123"));
        coll2.add(new Person("li",23));
        coll2.add(false);


        System.out.println("Collection equals 有序的:" + coll.equals(coll2));

    }


    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new Person("li",23));
        coll.add(false);

        //hashCode() 返回当前集合的哈希值
        System.out.println("Collection hashCode :"+ coll.hashCode());

        //集合------>数组
        Object[] array = coll.toArray();
        for (Object a : array){
            System.out.println(a);
        }

        //数组------> 集合
        List<String> list = Arrays.asList(new String[]{"123","234"});
        //list 拥有Collection 接口的所有方法
        System.out.println(list.getClass());
        System.out.println(list.getClass().getMethods());
        Method[] methods = list.getClass().getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }

        List<Integer> array1 = Arrays.asList(123,456);
        List<int[]> array2 = Arrays.asList(new int[]{123,456});

        List<String> array3 = Arrays.asList(new String[]{"AA","BB","CC"});
        List array4 = Arrays.asList(new String[]{"AA","BB","CC"});
        List array5 = Arrays.asList(new int[]{123,456});
        List array6 = Arrays.asList(new Integer[]{123,456});


        //如果形参为对象型的那么就一个个存起来，否则就会存为一个List中的一个元素
        System.out.println("List<Integer>  :" + array1);
        System.out.println("List<int[]> :" + array2);
        System.out.println("List<String> :" + array3);
        System.out.println("List  String :" + array4);
        System.out.println("List  int :" + array5);
        System.out.println("List  Integer :" + array6);
    }
}
