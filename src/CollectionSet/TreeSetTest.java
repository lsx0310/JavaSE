package CollectionSet;

import Collection.Person;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName TreeSetTest
 * @Description:
 * 底层为红黑树
 * 1.向TreeSet中添加的数据，要求是相同类的对象
 * 2.两种排序方式：自然排序（实现Comparable接口）  和   定制排序(实现Comparator接口)
 * 3.自然排序中，比较两个对象相同的标准为:compareTo()返回的0，不再是equals()
 * 3.定制排序中，比较两个对象相同的标准为:compare()返回的0，不再是equals()
 * @Authot li
 * @Date 2019/12/3
 * @Version v1.0
 **/

public class TreeSetTest {

    @Test
    public void Test1(){

        Set set = new TreeSet();

//        失败，TreeSet不能添加不同类的对象
//        set.add(123);
//        set.add("AA");

        //举例1            会排序
        set.add(123);
        set.add(234);
        set.add(-11);
        set.add(0);
        set.add(111);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //自然排序
    @Test
    public void Test2(){
        Set set = new TreeSet();

        set.add(new Person("li",12));
        set.add(new Person("wang",21));
        set.add(new Person("li",12));
        set.add(new Person("d",21));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //定制排序
    @Test
    public void Test3(){

        Comparator com = new Comparator() {
            //按照年龄从小到大排序，年龄一样不要了
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person person1 = (Person) o1;
                    Person person2 = (Person) o2;
                    return Integer.compare(person1.getAge(),person2.getAge());
                }else {
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        //有com参数按照定制排序，没有com参数 Set set = new TreeSet() 按照自然排序
        Set set = new TreeSet(com);

        set.add(new Person("li",12));
        set.add(new Person("wang",21));
        set.add(new Person("li",12));
        set.add(new Person("d",21));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
