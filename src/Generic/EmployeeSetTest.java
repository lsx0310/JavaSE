package Generic;

import org.junit.Test;
import Generic.EmployeeUseForTreeSet;
import java.util.*;

/**
 * @ClassName EmployeeSetTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/8
 * @Version v1.0
 **/

public class EmployeeSetTest {

    EmployeeUseForTreeSet user1 = new EmployeeUseForTreeSet("li",12,new MyDate(2008,12,13));
    EmployeeUseForTreeSet user2 = new EmployeeUseForTreeSet("wang",13,new MyDate(2006,11,13));
    EmployeeUseForTreeSet user3 = new EmployeeUseForTreeSet("bai",17,new MyDate(2003,10,13));
    EmployeeUseForTreeSet user4 = new EmployeeUseForTreeSet("pai",14,new MyDate(2005,1,13));
    EmployeeUseForTreeSet user5 = new EmployeeUseForTreeSet("xiao",110,new MyDate(1008,2,13));


    //自然排序
    @Test
    public void Test1(){

        TreeSet<EmployeeUseForTreeSet> set = new TreeSet<>();

        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);

        for (EmployeeUseForTreeSet user : set){
            System.out.println(user.toString());
        }
    }


    @Test
    public void Test2(){

        Comparator com = new Comparator<EmployeeUseForTreeSet>() {

            @Override
            public int compare(EmployeeUseForTreeSet o1, EmployeeUseForTreeSet o2) {
                MyDate d1 = o1.getBirthDay();
                MyDate d2 = o2.getBirthDay();
                return d1.compareTo(d2);
            }
        };

        TreeSet<EmployeeUseForTreeSet> set = new TreeSet(com);

        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);

        for (Object user : set){
            System.out.println(user.toString());
        }
    }

    //练习:在List中去除重复数字值，要求尽量简单
    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void Test3(){
        List list = new ArrayList();

        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(3));
        list.add(new Integer(3));

        List list1 = duplicateList(list);
        for (Object l1 : list1){
            System.out.println(l1);
        }
    }
}
