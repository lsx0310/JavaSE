package ClassPackage.EmployeeTest;

import java.util.Random;

/**
 * @ClassName ConstructorTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class ConstructorTest {
    public static void main(String[] args) {
        Employee_T[] staff = new Employee_T[3];

        staff[0] = new Employee_T("Harry", 30000);
        staff[1] = new Employee_T(60000);
        staff[2] = new Employee_T();

        for (Employee_T e: staff){
            System.out.println("name = " + e.getName() + "id =" + e.getId() + "salary=" + e.getSalary());
        }
    }
}

class Employee_T{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee_T(String n,double s){
        name = n;
        salary = s;
    }

    public Employee_T(double s){
        this("Employee #" + nextId,s);
    }

    public Employee_T(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
