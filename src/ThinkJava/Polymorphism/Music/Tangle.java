package ThinkJava.Polymorphism.Music;

/**
 * @ClassName Tangle
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class Tangle extends Shape{

    public int multiple;
    public double length;
    public double width;

    public Tangle(double length, double width) {
        super(length, width);
    }

    public Tangle(int multiple, double length, double width) {
        super(multiple, length, width);
    }

    @Override
    public void draw(int multiple) {
        super.draw(multiple);
        System.out.println("Tangle.draw()绘图的倍数为:" + multiple);
    }


    public void erase(double length,double width) {
        double area = length * width;
        System.out.println("Tangle.erase()计算的面积为:" + area);
    }
}
