package ClassPackage.Circle;

/**
 * @ClassName Rectangle
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class Rectangle {
    float width;
    float height;

    public Rectangle(float w,float h){
        this.width = w;
        this.height = h;
    }

    public float Area() {
        return this.width * this.height;
    }
}
