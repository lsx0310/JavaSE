package CollectionExpr.TreeSet;

import Collection.Person;
import org.junit.Test;

import java.util.HashSet;

/**
 * @ClassName PersonSetTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/8
 * @Version v1.0
 **/

public class PersonSetTest {

    PersonUseSetTest p1 = new PersonUseSetTest(1001,"D");
    PersonUseSetTest p2 = new PersonUseSetTest(1002,"C");
    PersonUseSetTest p3 = new PersonUseSetTest(1003,"B");
    PersonUseSetTest p4 = new PersonUseSetTest(1004,"A");

    @Test
    public void Test1(){
        HashSet set = new HashSet();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
        //更改了p1的name属性
        p1.name = "EE";
        //移除的时候调用PersonUseSetTest的hashcode()计算1001 EE 的哈希值的地方没有值，所以并未删除任何值
        set.remove(p1);
        System.out.println(set);

        //添加时调用PersonUseSetTest的hashcode()计算1001 EE 的哈希值的地方没有值，添加成功
        set.add(new PersonUseSetTest(1001,"EE"));
        System.out.println(set);
        //添加时调用PersonUseSetTest的hashcode()计算1001 D 的哈希值的地方有值，但是调用equals方法不相等，所以继续以链表的形式存入，添加成功
        set.add(new PersonUseSetTest(1001,"D"));
        System.out.println(set);

    }

}
