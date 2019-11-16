package ClassPackage.EmployeeTest;

/**
 * @ClassName StaticTest
 * @Description: Static
 * @Authot li
 * @Date 2019/11/9
 * @Version v1.0
 **/

public class StaticTest {

    public static void main(String[] args){
        Employee_2[] staff = new Employee_2[3];

        staff[0] = new Employee_2("tom",20000);
        staff[1] = new Employee_2("dick",13131);
        staff[2] = new Employee_2("Harry",65000);

        for (Employee_2 e : staff){
            e.setId();
            System.out.println("name = " + e.getName() + "salary = " + e.getSalary());
        }

        int n = Employee_2.getNextId();
        System.out.println("Next availaable id =" + n);
    }
}

class Employee_2{

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee_2(String n,double s){
        name = n;
        salary = s;
        id  = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId; //returns static field
    }

    public static void setNextId(int nextId) {
        Employee_2.nextId = nextId;
    }

    public static void main(String[] args){

        Employee_2 e = new Employee_2("Harray",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }




}