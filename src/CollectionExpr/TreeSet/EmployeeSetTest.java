package CollectionExpr.TreeSet;

import org.junit.Test;

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

        TreeSet set = new TreeSet();

        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);

        for (Object user : set){
            System.out.println(user.toString());
        }
    }


    @Test
    public void Test2(){

        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof EmployeeUseForTreeSet && o2 instanceof EmployeeUseForTreeSet){
                    EmployeeUseForTreeSet use1 = (EmployeeUseForTreeSet) o1;
                    EmployeeUseForTreeSet use2 = (EmployeeUseForTreeSet) o2;
                    return use1.getBirthDay().getForBirthDay().compareTo(use2.getBirthDay().getForBirthDay());
                }else {
                    throw new RuntimeException("输入的类型不一致");
                }
            }
        };

        TreeSet set = new TreeSet(com);

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
