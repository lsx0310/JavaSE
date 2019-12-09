package Collection;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName IteratorTest
 * @Description: 集合元素的遍历操作，使用Iterator 迭代器接口
 * 内部的方法hasNext() 和 next（）结合去用
 * @Authot li
 * @Date 2019/11/26
 * @Version v1.0
 **/

public class IteratorTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new Person("li",23));
        coll.add(false);


        Iterator iterator = coll.iterator();

        //推荐
        //hasNext()判断是否还有下一个元素
        while (iterator.hasNext()){
            //next()指针下移，返回指向的元素
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new Person("li",23));
        coll.add(false);


        //错误方式
        //每次调用iterator() 会生成一个新的迭代器
        while (coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }

    //迭代器中的remove方法
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(4456);
        coll.add("liming");
        coll.add(new Person("li",23));
        coll.add(false);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("liming".equals(obj)){
                iterator.remove();
            }
        }

        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
