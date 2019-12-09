package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListRemoveTest
 * @Description: TODO  List remove 方法的使用区分
 * @Authot li
 * @Date 2019/11/27
 * @Version v1.0
 **/

public class ListRemoveTest {

    @Test
    public void Test1(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        upListData(list);
        System.out.println(list);

    }

    private void upListData(List list){
        //list.remove(2);   //删除下标
        list.remove(new Integer(2));   //删除元素2
    }
}
