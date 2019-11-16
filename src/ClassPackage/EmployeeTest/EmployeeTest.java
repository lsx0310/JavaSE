package ClassPackage.EmployeeTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName EmployeeTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/9
 * @Version v1.0
 **/

public class EmployeeTest {

    public static void main(String[] args){

        ArrayList <Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker",75000,1987,12,15));
        staff.add(new Employee("Harry Hacker",50000,1989,10,1));
        staff.add(new Employee("Tony Tester",40000,1992,3,2));
//        转化为数组
//        Employee[] a = new Employee[staff.size()];
//        staff.toArray(a);
//        a[0] = new Employee("Carl Cracker",75000,1987,12,15);
//        a[1] = new Employee("Harry Hacker",50000,1989,10,1);
//        a[2] = new Employee("Tony Tester",40000,1992,3,2);

        for (Employee e : staff){
            e.raiseSalary(5);
        }

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary =" + e.getSalary() + ",hireDay="
                    +e.getHireDay());
    }
}

class Employee{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s){
        name = n;
        salary = s;
    }
    public Employee(String n,double s,int year,int month,int day){
        this(n,s);
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    // 如果需要返回一个可变对象的引用，应该首先对它进行克隆(clone)，对象clone是指存放在另一个位置上的对象副本
    public Date getHireDay(){
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
