package Generic;

import org.junit.Test;

import javax.xml.ws.RequestWrapper;
import java.util.*;

/**
 * @ClassName GenericTest
 * @Description: TODO 集合接口在5.0修改为带泛型的接口
 *               在实例化集合类时可指明具体的泛型类型
 *               指定完后，在集合类或接口时，内部结构使用到类的泛型的位置，都写为实例化时的类型
 *               注意点：泛型的类型必须是类，不能是基本数据类型，需要使用基本类型时，使用包装类代替
 *               如果实例化时没有指定泛型的类型，默认为Object类型
 * @Authot li
 * @Date 2019/12/16
 * @Version v1.0
 **/

public class GenericTest {


    //未使用泛型
    @Test
    public void Test1(){
        ArrayList list = new ArrayList<>();
        //添加学生成绩
        list.add(91);
        list.add(89);
        list.add("tom");

        //问题一： 类型不安全
        //问题二： 强转时，可能出现ClassCastException
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //使用泛型
    @Test
    public void Test2(){
        ArrayList<Integer> list = new ArrayList<>();
        //添加学生成绩
        list.add(91);
        list.add(89);
        // can not be applied
        //list.add("tom");
        //编译时就会报错，避免了强转

    }


    //在集合中使用泛型
    @Test
    public void Test3(){

        HashMap<String,Integer> map = new HashMap<>();

        map.put("tom",11);
        map.put("lili",12);


        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println("key = " + key + "------->" + value);
        }
    }
}
