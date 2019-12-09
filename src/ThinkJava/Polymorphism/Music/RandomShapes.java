package ThinkJava.Polymorphism.Music;

import java.util.Random;

/**
 * @ClassName RandomShapes
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class RandomShapes {

    private Random random = new Random(47);

    public Shape get(){
        switch (random.nextInt(3)){
            default:
            case 0:return new Circle(3);
            case 1:return new Tangle(4,2);
        }
    }

    public Shape[] getArray(int sz){
        Shape[] shapes = new Shape[sz];
        for (int i = 0;i < shapes.length ;i++){
            shapes[i] = get();
        }

        return shapes;
    }
}
