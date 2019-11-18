package ThinkJava.This;

/**
 * @ClassName OrderofInitialization
 * @Description: TODO  类内部变量的初始化，是在所有方法调用之前（包括构造）之前完成的
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/


public class OrderofInitialization {
    public static void main(String[] args){
        House house = new House();
        house.f();
    }
}

class Window{
    Window(int marker){
        System.out.println("window(" + marker + ")");
    }
}

class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("House()");
        Window w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f(){
        System.out.println("house f function");
    }
    Window w3 = new Window(3);
}