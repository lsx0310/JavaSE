package ClassPackage.Circle;


/**
 * @ClassName Test
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class Test {

    public static void main(String[] args){
        Circle c1 = new Circle(12);
        Rectangle r1 = new Rectangle(11.1F,12.22F);
        Rectangle r2 = new Rectangle(10,3);

        System.out.println(c1.getRadius());
        System.out.println(MaxArea(c1,r1));
        System.out.println(MaxArea(c1));
        System.out.println(MaxArea(c1,r1,r2));

    }

    public static float MaxArea(Circle c,Rectangle... Vars){
        Rectangle[] rs = Vars;
        float maxarea = c.Area();

        for (Rectangle r : rs){
            if (r.Area() > maxarea){
                maxarea = r.Area();
            }
        }

        return maxarea;
    }
}
