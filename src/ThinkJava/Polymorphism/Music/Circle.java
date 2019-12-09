package ThinkJava.Polymorphism.Music;

import ClassPackage.interfaceTest.Shape2D;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ClassName Circle
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class Circle extends Shape {
    public int multiple;
    public double r;
    final static double PI = 3.14;

    public Circle(double r){
        super(r);
    }

    public Circle(int multiple,double r){
        super(multiple,r);
    }

    @Override
    public void draw(int multiple) {
        super.draw(multiple);
        System.out.println("Circle.draw()画图的倍数为:" + multiple) ;
    }

    @Override
    public void erase(double r) {
        double area = PI * r * r;
        System.out.println("Circle.erase()计算的面积为:" + area);
    }
}
