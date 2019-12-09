package ThinkJava.Polymorphism.Music;

/**
 * @ClassName ShapeTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class ShapeTest {

    public static void main(String[] args){
        RandomShapes gens = new RandomShapes();

        for (Shape shape : gens.getArray(9)){
            shape.draw(2);
        }
    }
}
