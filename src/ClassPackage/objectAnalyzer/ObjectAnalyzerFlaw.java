package ClassPackage.objectAnalyzer;

import org.intellij.lang.annotations.Identifier;

import javax.swing.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName ObjectAnalyzerFlaw
 * @Description: TODO  会死循环
 * @Authot li
 * @Date 2019/11/16
 * @Version v1.0
 **/

public class ObjectAnalyzerFlaw {

    //与Object 中 toString 方法参数不一样 不是重写 no Override
    public String toString(Object obj){
        Class cl = obj.getClass();

        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);

            for (Field field : fields){
                if (!Modifier.isStatic(field.getModifiers())){
                    if (!r.endsWith("[")) r += ",";
                    r += field.getName() + "=";

                    try{
                        Object val = field.get(obj);
                        r += toString(val);
                    }
                    catch (Exception e) {e.printStackTrace();}
                }

                r += ']';
                cl = cl.getSuperclass();
                System.out.println(cl);
                System.out.println(Object.class);
            }

        }
        while (cl != Object.class);

        return r;
    }
}
