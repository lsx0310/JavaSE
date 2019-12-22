package MapExpr.TreeMap;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @ClassName PersonUseForTreeMap
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class PersonUseForTreeMap implements Comparable{

    private String name;
    private String ageGroup;
    private Integer age;

    public PersonUseForTreeMap(String name, String ageGroup) {
        this.name = name;
        this.ageGroup = ageGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Integer getAge() {
        try {
            AgeGroup ageGroup = Enum.valueOf(AgeGroup.class, this.ageGroup);
            return ageGroup.getAge();
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PersonUseForTreeMap{" +
                "name='" + name + '\'' +
                ", ageGroup='" + ageGroup + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonUseForTreeMap that = (PersonUseForTreeMap) o;
        return this.getAge() == that.getAge() &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    //自然排序 按照name从大到小  age 从小到大
    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof PersonUseForTreeMap) {
            PersonUseForTreeMap user = (PersonUseForTreeMap) o;
            int comPare = this.name.compareTo(user.getName());
            if (comPare == 0){
                return this.getAge().compareTo(user.getAge());
            }else {
                return comPare;
            }
        }else {
            throw new RuntimeException("输入的类型不一致");
        }
    }
}
