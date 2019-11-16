package ClassPackage.objectAnalyzer;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @ClassName ObjectAnalyzerFlaw_Test
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/16
 * @Version v1.0
 **/

public class ObjectAnalyzerFlaw_Test {

    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1;i <=5;i++){
            squares.add(i*i);
        }
        System.out.println("start");
        System.out.println(new ObjectAnalyzer().toString(squares));
        System.out.println("end");
    }
}
