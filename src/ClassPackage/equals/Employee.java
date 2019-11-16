package ClassPackage.equals;

import org.jetbrains.annotations.Contract;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * @ClassName Employee
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }


    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object obj) {
        // a quick test to see if the objects are identical
        if (this == obj) return true;

        //must return false if the explicit parameter is null
        if (obj == null) return false;
        //if the class is not match,they cant be
        if (getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;

        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name =" + name + "salary =" + salary + ",hireDay =" + hireDay + ']';
    }
}
