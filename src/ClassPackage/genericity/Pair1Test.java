package ClassPackage.genericity;

import javafx.util.Pair;

/**
 * @ClassName Pair1
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/18
 * @Version v1.0
 **/

public class Pair1Test {

    public static void main(String[] args){
        String[] strings = {"Mary","bad","a","little","lamb"};
        ArrayAlg.Pair<String> pair = ArrayAlg.minmax(strings);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}


class ArrayAlg{

    public static <T extends Comparable> Pair<T> minmax(T[] s){
        if (s==null || s.length == 0) return null;
        T min = s[0];
        T max = s[0];
        for (int i = 1;i < s.length;i++){
            if (min.compareTo(s[i]) > 0) min = s[i];
            if (max.compareTo(s[i]) < 0) max = s[i];
        }
        return new Pair<T>(min,max);
    }

    public static class Pair<T>{
        private T first;
        private T second;

        public Pair(T first, T second) {
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
}
