package ThinkJava;

/**
 * @ClassName Tree
 * @Description: TODO  重载方法可以用出参数区分，也可以用返回值类型区分
 *                     如果参数为基本类型，在实际调用时，系统会做一定的自动转型
 *                     不写  给你默认构造器，写了就不给
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class Tree {
    private int hight;

    Tree(){
        System.out.println("默认构造函数");
    }

    Tree(int initalHeight){

        System.out.println("含参数的构造函数");
        this.hight = initalHeight;

    }
}
