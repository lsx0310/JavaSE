package ClassPackage.interfaceTest;

/**
 * @ClassName Circle
 * @Description: 接口的多重继承
 * @Authot li
 * @Date 2019/10/14
 * @Version v1.0
 **/

public class Circle implements Shape2D,Color {

    private double radius;
    private String color;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return (pi * this.radius * this.radius);
    }

    public void setColor(String str){
        this.color = str;
        System.out.println("color = " + this.color);
    }
}
