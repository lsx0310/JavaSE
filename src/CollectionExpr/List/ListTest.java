package CollectionExpr.List;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName ListTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class ListTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List list = new ArrayList();

        System.out.println("请输入10个整数:");
        for (int i = 0;i < 10;i++){
            int n = in.nextInt();
            System.out.println(n);
            list.add(n);
        }

        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
