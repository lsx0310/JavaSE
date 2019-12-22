package Generic;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * @ClassName MyDate
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/8
 * @Version v1.0
 **/

public class MyDate implements Comparable<MyDate>{

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getForBirthDay(){
        return new Date(this.year,this.month,this.day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(@NotNull MyDate o) {
        return this.getForBirthDay().compareTo(o.getForBirthDay());
    }
}
