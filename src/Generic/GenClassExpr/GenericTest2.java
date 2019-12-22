package Generic.GenClassExpr;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName GenericTest2
 * @Description:
 * 泛型在继承方面的体现
 * 类A是类B的父类，G<A>和G<B>二者不具有父子关系，二者是并列关系。
 *
 * 补充 类A是类B的父类，A<G> 是 B<G> 的父类
 *
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class GenericTest2 {

    @Test
    public void Test1(){
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //编译不通过
        //list1 = list2
        //反证法
        //假设list1 = list2;
        //list1.add(123);导致混入非String的数据，出错。

        //show(list2);  编译出错
        show(list1);
        show1(list2);
    }

    public void show(List<Object> list){

    }

    public void show1(List<String> list){

    }

    @Test
    public void Test2(){
        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1=list2;

    }


    /*
    通配符的使用  ?
    类A是类B的父类，G<A>和G<B>是没有关系的，他们的共同父类是G<?>
    * */
    @Test
    public void Test3(){

        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<?> list = new ArrayList<>();


        list = list1;
        list = list2;

        print(list);


        list2.add("AA");
        list2.add("BB");
        list2.add("CC");

        list = list2;

        //添加(写入)：对于List<?>  就不能向其内部添加数据
        //例外，除了添加null
        //list.add("DD");编译不通过
        list.add(null);

        //获取（读取） 允许读取数据，读取的数据类型为Object
        Object obj = list.get(0);
        System.out.println(obj);

    }

    public void print(ArrayList<?> list){

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }


    /*
    * 有限制条件的通配符使用
    * */
}
