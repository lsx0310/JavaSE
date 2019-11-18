package ThinkJava.This.StaticFields;

/**
 * @ClassName Cupboard
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class Cupboard {
    StaticInitialization.Print p = new StaticInitialization.Print();
    Bowl bowl3= new Bowl(3);
    static  Bowl bowl4 = new Bowl(4);
    Cupboard(){
        p.printl("Cupboard()");
    }
    void f3(int i){
        p.printl("f3(" + i + ")");
    }
    static  Bowl bowl5 = new Bowl(4);
}