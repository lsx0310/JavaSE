package ThinkJava.Polymorphism.Music;

/**
 * @ClassName Shape
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class Shape {

    private int multiple;
    private double r;
    final static double PI = 3.14;
    private double length;
    private double width;

    public Shape(double r) {
        this.r = r;
        this.multiple = 1;
    }

    public Shape(int multiple, double r) {
        this(r);
        this.multiple = multiple;
    }

    public Shape(double length,double width) {
        this.multiple = 1;
        this.length = length;
        this.width = width;
    }

    public Shape(int multiple,double length,double width) {
        this.multiple = multiple;
        this.length = length;
        this.width = width;
    }

    public void draw(int multiple){
        System.out.println("Shape.draw()画放大多少倍:" + multiple);
    }

    public void erase(double r){
        System.out.println("Shape.erase()计算面积为:" + r);
    }
}
