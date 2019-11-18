package ThinkJava.This.StaticFields;

/**
 * @ClassName Table
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class Table {
    static Bowl bowl1 = new Bowl(1);
    StaticInitialization.Print p = new StaticInitialization.Print();

    Table(){
        p.printl("Table()");
        bowl2.f1(1);
    }
    void f2(int i){
        p.printl("f2(" + i + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}