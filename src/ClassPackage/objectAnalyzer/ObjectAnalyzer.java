package ClassPackage.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @ClassName ObjectAnalyzer
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/16
 * @Version v1.0
 **/

public class ObjectAnalyzer {

    private ArrayList<Object> visited = new ArrayList<>();

    /**
     * Converts an object to a string  representation that lists all fields
     * @param obj an Object
     * @return a string with the objects class name and all fields namea and valus
     * */
    public String toString(Object obj){

        if (obj == null) return "null";
        if (visited.contains(obj)) return obj.toString();
        visited.add(obj);
        Class cl = obj.getClass();
        System.out.println(cl.getName());
        if (cl == String.class) return (String)obj;
        if (cl.isArray()){
            String r = cl.getComponentType() + "[]{";
            for (int i = 1;i < Array.getLength(obj);i++){
                if (i > 1) r += ",";
                Object val = Array.get(obj,i);
                if (cl.getComponentType().isPrimitive()) r += val;
                else r += toString(val);
            }
        return r + "}";
        }

        String r = cl.getName();
        //inspect the fields of this class and all superclasses
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
            //get the names and values if all fields
            for (Field field : fields){
                if (!Modifier.isStatic(field.getModifiers())){
                    if (!r.endsWith("[")) r += ',';
                    r += field.getName() + "=";
                    try{
                        Class t = field.getClass();
                        Object val = field.get(obj);
                        if (t.isPrimitive()) r += val;
                        else r += toString(val);

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }
        while (cl != null);
        return r;
    }
}
