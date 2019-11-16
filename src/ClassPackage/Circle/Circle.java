package ClassPackage.Circle;

import java.awt.*;

/**
 * @ClassName Cricle
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class Circle {
    static float PI = 3.14F;
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public float Area(){
        return 2 * PI * this.radius;
    }

    public void enlarge(int factor){
        this.radius = this.radius * factor;
    }

    public boolean fitsInside(Rectangle r){
        return (2*this.radius < r.height) && (2*this.radius < r.width);
    }
}
