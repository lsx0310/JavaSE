package ClassPackage.Enum;

/**
 * @ClassName Planet
 * @Description: Enum
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public enum Planet {

    //枚举类以逗号间隔，分号结束
    MERCURY (3.303e+23,2.4397e6),
    VENUS (4.869e+24,6.0518e6),
    EARTH (5.976e+24,6.3278e6);



    private final double mass;
    private final double radius;

    Planet(double mass,double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static final double G = 6.6700E-11;

    double surfaceGravity(){
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass){
        return otherMass * surfaceGravity();
    }

    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("java Planet");
            System.exit(-1);
        }

        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / EARTH.surfaceGravity();
        for (Planet p : Planet.values()){
            System.out.printf("Your weight on %s is %f%n",
                    p,p.surfaceWeight(mass));
        }
    }

}
