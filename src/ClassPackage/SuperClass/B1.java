package ClassPackage.SuperClass;

/**
 * @ClassName B1
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/11
 * @Version v1.0
 **/

public class B1 extends A1 {

    int x = 100;

    void printb(){
        super.x = super.x + 10;
        System.out.println("super = " + super.x + "x =" + x);
    }
}
