package ThinkJava.This.StaticFields;

/**
 * @ClassName StaticInitialization
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class StaticInitialization {
     static class Print {
        void printl(String str){
            System.out.println(str);
        }
    }

    static Print p = new Print();
    public static void  main(String[] args){
        p.printl("Creat new Cupboard() in main");
        new Cupboard();
        p.printl("Creat new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

    }
    static  Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
