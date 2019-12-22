package CollectionExpr.TreeSetExpr;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TreeSetForStuTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/10
 * @Version v1.0
 **/

public class TreeSetForStuTest {

    StuUseForTreeTest stu1 = new StuUseForTreeTest("tom",12.12);
    StuUseForTreeTest stu2= new StuUseForTreeTest("lena",14.12);
    StuUseForTreeTest stu3= new StuUseForTreeTest("pipa",15.12);
    StuUseForTreeTest stu4= new StuUseForTreeTest("li",19.12);

    @Test
    public void Test(){
        Set set = new TreeSet();

        set.add(stu1);
        set.add(stu2);
        set.add(stu4);
        set.add(stu3);

        StuUseForTreeTest[] arr = new StuUseForTreeTest[set.size()];
        set.toArray(arr);
        for (int i = 0;i<3;i++){
            StuUseForTreeTest stu = arr[i];
            System.out.println(stu.getName());
        }
    }
}
