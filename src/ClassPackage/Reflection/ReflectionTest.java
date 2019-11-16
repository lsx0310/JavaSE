package ClassPackage.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Scanner;


/**
 * @ClassName ReflectionTest
 * @Description: This program uses reflection to print all features of a class
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class ReflectionTest {

    public static void main(String[] args){
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = in.next();
        }

        try{
            //print class name and superclass name (if != Object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class" + cl.getName() + " ");
            if (supercl != null && supercl != Object.class)
                System.out.print("extends" + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);

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
            System.out.print(retType.getName() + "" + name + "(");

            //print parameters types
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes){
                if (paramTypes.length > 0) System.out.println(paramType.getName());
                System.out.println(")");
            }

        }
    }

    /**
     * Prints all fields of a class
     * @param cl a class
     * */
    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields){
            Class type = field.getType();
            String name = field.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(type.getName() + "" + name + ";");

        }
    }

}
