package StringPackage;

import java.util.Scanner;

/**
 * @ClassName InputTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class InputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("what is u name?");
        String name = in.nextLine();

        System.out.println("how old are u?");
        int age = in.nextInt();

        System.out.println("Hello" + name + "Next year,u will be" + (age + 1));

    }
}
