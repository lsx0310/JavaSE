package ClassPackage.abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName Employee
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class Employee extends Person{
//    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s){
        super(n);
        salary = s;
    }
    public Employee(String n,double s,int year,int month,int day){
        this(n,s);
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }

//    public String getName(){
//        return name;
//    }

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
