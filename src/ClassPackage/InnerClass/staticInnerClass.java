package ClassPackage.InnerClass;

/**
 * @ClassName staticInnerClass
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class staticInnerClass {

    public static void main(String[] args){
        double[] d = new double[20];
        for (int i = 0;i < d.length;i++){
            d[i] = 100*Math.random();
        }

        ArrayAlg.Pair pair =  ArrayAlg.minmax(d);
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}


class ArrayAlg{

    public static class Pair{

        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    public static Pair minmax(double[] values){
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double d : values){
            if (min > d) min = d;
            if (max < d) max = d;
        }

        return new Pair(min,max);

    }
}