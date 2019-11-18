package ThinkJava.This.StaticFields;

/**
 * @ClassName Bowl
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class Bowl {
    StaticInitialization.Print p = new StaticInitialization.Print();
    Bowl(int i){
        p.printl("Bowl(" + i + ")");
    }
    void f1(int i){
        p.printl("f1(" + i + ")");
    }
}

