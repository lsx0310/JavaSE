package CollectionExpr.TreeSet;

import org.jetbrains.annotations.NotNull;

/**
 * @ClassName EmployteeUseForTreeSet
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/8
 * @Version v1.0
 **/

public class EmployeeUseForTreeSet implements Comparable{

    private String name;
    private int age;
    private MyDate birthDay;

    public EmployeeUseForTreeSet(String name, int age, MyDate birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "EmployleeUseForTreeSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }

    //按照name排序
    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof EmployeeUseForTreeSet){
            EmployeeUseForTreeSet user = (EmployeeUseForTreeSet) o;
            return -this.name.compareTo(user.getName());
        }else {
            throw new RuntimeException("输入的类型不一致");
        }
    }
}
