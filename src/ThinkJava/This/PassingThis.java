package ThinkJava.This;

import ClassPackage.equals.Apple;

/**
 * @ClassName PassingThis
 * @Description: TODO 通过this关键字将对象传递给其他方法
 *                    记住，this 关键字用来做当前对象的引用，可以传给当前方法，也可以传递给其他方法
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple_());
    }
}

class Person{
    public void eat(Apple_ apple){
        Apple_ peeled = apple.getPeeled();
        System.out.println("Eat Peeled apple");
    }
}

class Peeler{
    static Apple_ peel(Apple_ apple){
        System.out.println("Peeling apple");
        return apple;
    }
}

class Apple_{
    Apple_ getPeeled(){
        return Peeler.peel(this);
    }
}

