package ClassPackage.SuperClass;

/**
 * @ClassName E_4Test
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/11
 * @Version v1.0
 **/

public class E_4Test {

    public static void main(String[] args){

        A1 a1 = new A1();
        a1.setx(4);
        a1.printa();

        B1 b1 = new B1();
        b1.printb();
        b1.printa();

        b1.setx(6);
        b1.printb();
        b1.printa();
        a1.printa();
    }
}
