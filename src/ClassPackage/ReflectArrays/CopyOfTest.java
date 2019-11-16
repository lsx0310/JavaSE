package ClassPackage.ReflectArrays;

import java.lang.reflect.Array;

/**
 * @ClassName CopyOfTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/16
 * @Version v1.0
 **/

public class CopyOfTest {


    /**
     *This method attempts to grow an array by allocating a new array and copying all elements
     * @param a the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements if a. However ,the returned array has
     * type Object[],not the same type as a*/

    public static Object[] badCopyOf(Object[] a,int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;
    }

    /**
     * This method grows an array by allocating a new array of the SAME TYPE and copying all elements
     * @param a the array to grow . this can be an object array or a primitive type array
     * @return a larger array that contains all elements of a.
     * */
    public static Object goodCopyOf(Object a,int newLength){
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }
}
