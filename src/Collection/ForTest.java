package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName ForTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/26
 * @Version v1.0
 **/

public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new Person("li",23));
        coll.add(false);

        for (Object obj : coll){
            System.out.println(obj);
        }

    }


    @Test
    public void test2(){
        int[] arr1 = new int[]{1,23,42,5};
        for (int i : arr1){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr2 = new String[]{"MM","MM","MM"};
        //要改变arr2中的值需使用普通for循环，foreach只是将s指向一个GG的字符串arr2中内容并没有变
        for (int i = 0;i < arr2.length;i++){
            arr2[i] = "GG";
        }

    }

}
