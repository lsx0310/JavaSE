package ClassPackage.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * @ClassName ReflectionTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class ReflectionTest {

    public static void main(String[] args){
        // read class name from command line args or user input
        String name;

    }


    /**
     * Prints all constructors of a class
     * @param cl a class
     * */
    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors){
            String name = c.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.println("modifier = " + modifiers);
            System.out.println(name + "(");

            //print parameter types
            Class[] parameters = c.getParameterTypes();
            for (Class parameter : parameters){
                if (parameters.length > 0) System.out.println(",");
                System.out.println(parameter.getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param cl a class
     * */
    public static void printMethods(Class cl){
        Method[] methods = cl.getMethods();
        for (Method method : methods){
            Class retType = method.getReturnType();
            String name = method.getName();

            System.out.println("   ");
            //print modifiers,return type and method name
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() >0) System.out.println(modifiers + " ");
            System.out.println(retType.getName() + "" + name + "(");

            //print parameters types
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes){
                if (paramTypes.length > 0) System.out.println(paramType.getName());
                System.out.println(")");
            }

        }
    }

}
