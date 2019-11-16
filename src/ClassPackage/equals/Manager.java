package ClassPackage.equals;

import java.util.Date;

/**
 * @ClassName Manager
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class Manager extends Employee{

    private double bonus;

    public Manager(String n,double s,int year,int month,int day){
        super(n,s,year,month,day);
        bonus = 0;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus =" + bonus + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager other = (Manager) obj;

        return bonus == other.bonus;
    }
}
