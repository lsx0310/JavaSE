package MapExpr.TreeMap;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName TreeMapTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class TreeMapTest {

    PersonUseForTreeMap user1 = new PersonUseForTreeMap("Tom","AGED");
    PersonUseForTreeMap user2 = new PersonUseForTreeMap("LILI","PPP");
    PersonUseForTreeMap user3 = new PersonUseForTreeMap("Pipe","YOUNGAGE");
    PersonUseForTreeMap user4 = new PersonUseForTreeMap("Ana","TEENAGE");
    PersonUseForTreeMap user5 = new PersonUseForTreeMap("Ana","PPP");


    @Test
    public void Test1(){

        TreeMap map = new TreeMap();

        map.put(user1,user1.getAge());
        map.put(user2,user2.getAge());
        map.put(user3,user3.getAge());
        map.put(user4,user4.getAge());
        map.put(user5,user5.getAge());

        System.out.println(map);
    }

    //TreeMap 定制排序 按照name 排序，删除name相同的User
    @Test
    public void Test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof PersonUseForTreeMap && o1.getClass() == o2.getClass()){
                    PersonUseForTreeMap user1 = (PersonUseForTreeMap) o1;
                    PersonUseForTreeMap user2 = (PersonUseForTreeMap) o2;
                    return user1.getName().compareTo(user2.getName());
                }else {
                    throw new RuntimeException("你输入的类型不匹配");
                }
            }
        };

        TreeMap map = new TreeMap(com);
        map.put(user1,user1.getAge());
        map.put(user2,user2.getAge());
        map.put(user3,user3.getAge());
        map.put(user4,user4.getAge());
        map.put(user5,user5.getAge());
        System.out.println(map);
    }
}
