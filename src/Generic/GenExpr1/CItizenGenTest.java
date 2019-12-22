package Generic.GenExpr1;

import ClassPackage.Circle.Circle;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName CItizenGenTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class CItizenGenTest {

    @Test
    public void main(){

        HashMap<String, ArrayList<Citizen>> map = new HashMap<>();

        ArrayList<Citizen> list = new ArrayList<>();

        list.add(new Citizen("李"));
        list.add(new Citizen("潘"));
        list.add(new Citizen("麦"));

        map.put("李",list);

        Set<Map.Entry<String, ArrayList<Citizen>>> set = map.entrySet();

        Iterator<Map.Entry<String,ArrayList<Citizen>>> iterator = set.iterator();

        //Collection<ArrayList<Citizen>> c = map.values();  可以直接获取

        while (iterator.hasNext()){

            Map.Entry<String,ArrayList<Citizen>> entry = iterator.next();
            String P1 = entry.getKey();
            ArrayList<Citizen> L1 = entry.getValue();
            System.out.println("户主名为：" + P1);
//            System.out.println("户主名为：" + L1);
            for (Citizen c : L1){
                System.out.println("家庭成员：" + c);
            }
        }




    }
}
