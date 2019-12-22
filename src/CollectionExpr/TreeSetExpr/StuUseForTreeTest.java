package CollectionExpr.TreeSetExpr;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @ClassName StuUseForTreeTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/10
 * @Version v1.0
 **/

public class StuUseForTreeTest implements Comparable{

    private String name;
    private Double score;
    private int id;
    private static int identifier = 0;


    public StuUseForTreeTest(String name, Double score) {
        this.name = name;
        this.score = score;
        this.id = identifier ++;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StuUseForTreeTest that = (StuUseForTreeTest) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }


    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof StuUseForTreeTest){
            StuUseForTreeTest stu = (StuUseForTreeTest) o;
            return -this.getScore().compareTo(stu.getScore());
        }else {
            throw new RuntimeException("输入的类型不匹配！");
        }
    }

    @Override
    public String toString() {
        return "StuUseForTreeTest{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", id=" + id +
                '}';
    }
}
