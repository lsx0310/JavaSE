package ClassPackage.Enum;

import java.util.Scanner;

/**
 * @ClassName SizeTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class SizeTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size= " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job ---u paid attention to the _.");
    }
}


 enum Size{
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;
    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

}
