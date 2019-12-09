package ClassPackage.genericity;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName Pair2
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/19
 * @Version v1.0
 **/

public class Pair2Test {

    public static void main(String[] args){
        GregorianCalendar[] birthDays = {
                new GregorianCalendar(1906, Calendar.DECEMBER,9),
                new GregorianCalendar(1989,Calendar.OCTOBER,2),
                new GregorianCalendar(2000,Calendar.MAY,2),
        };

        Pair2<GregorianCalendar> pair2 =  ArrayAlg2.minmax(birthDays);
        System.out.println(pair2.getFirst().getTime());
        System.out.println(pair2.getSecond().getTime());

    }
}


class ArrayAlg2{

    public static <T extends Comparable>  Pair2<T> minmax(T[] t){
        if (t == null || t.length == 0){
            return null;
        }

        T min = t[0];
        T max = t[0];
        for (int i = 0;i < t.length;i++){
            if (min.compareTo(t[i]) > 0) min = t[i];
            if (max.compareTo(t[i]) < 0) max = t[i];
        }

        return new Pair2<>(min,max);
    }

}


class Pair2<T> {

    private T first;
    private T second;

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
