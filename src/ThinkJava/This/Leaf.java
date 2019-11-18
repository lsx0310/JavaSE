package ThinkJava.This;

/**
 * @ClassName Leaf
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class Leaf {
    int i = 0;
    Leaf increasment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i=" + i);
    }

    public static void main(String[] args){
        Leaf x = new Leaf();
        x.increasment().increasment().increasment().print();
    }
}
