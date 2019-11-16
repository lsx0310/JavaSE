package ClassPackage.EmployeeTest;

import java.util.EnumMap;

/**
 * @ClassName ParamTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class ParamTest {

    public static void main(String[] args){

        System.out.println("testing tripleValue");
        double percent = 10;
        System.out.println("Before : precent = " + percent);
        tripleValue(percent);
        System.out.println("After : percent = " + percent);

        System.out.println("testing tripleSalary");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before : salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After : salary=" + harry.getSalary());

        System.out.println("testing swap");
        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",65000);
        System.out.println("Before : Alice" + a.getSalary());
        System.out.println("Before : Bob" + b.getSalary());
        swap(a,b);
        System.out.println("Before : Alice" + a.getSalary());
        System.out.println("Before : Bob" + b.getSalary());
    }


    public static void tripleValue(double r){
        r = 3 * r;
        System.out.println("End of method: r=" + r);
    }

    public static void tripleSalary(Employee e){
        e.raiseSalary(200);
        System.out.println("End of method:salary = " + e.getSalary());
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method : x=" + x.getName());
        System.out.println("End of method : y=" + y.getName());
    }
}
