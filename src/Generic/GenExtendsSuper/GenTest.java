package Generic.GenExtendsSuper;

import org.junit.Test;
import sun.plugin.javascript.navig.AnchorArray;

import java.util.ArrayList;

/**
 * @ClassName GenTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class GenTest {

    @Test
    public void Test1(){
        ArrayList<? extends Person> list1 = null;
        ArrayList<? super Person> list2 = null;

        ArrayList<Object> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();
        ArrayList<Person> list5 = new ArrayList<>();

        //extends Person本身及子类
        list1 = list4;
        list1 = list5;

        Person person =  list1.get(0);



        //super Person本身及父类
        list2 = list3;
        list2 = list5;



    }
}
