package ClassPackage.Clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName Employee
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/16
 * @Version v1.0
 **/

public class Employee implements Cloneable{

    private String name;
    private double salary;
    private Date hireDay;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        //call Object.clone()
        Employee cloned = (Employee) super.clone();
        //call mutable fields
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public double raiseSalary(double byPercent){
        this.salary += this.salary * byPercent /100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
