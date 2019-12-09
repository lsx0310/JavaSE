package CollectionExpr.TreeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @ClassName PersonSetTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/8
 * @Version v1.0
 **/

public class PersonUseSetTest implements Comparable{

    int id;
    String name;

    public PersonUseSetTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonSetTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonUseSetTest that = (PersonUseSetTest) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    //按name排序
    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof PersonUseSetTest) {
            PersonUseSetTest user = (PersonUseSetTest) o;
            return -this.name.compareTo(user.getName());
        }else {
            throw new RuntimeException("输入的类型不一致");
        }
    }
}
