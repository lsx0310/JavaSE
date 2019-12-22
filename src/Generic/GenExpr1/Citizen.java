package Generic.GenExpr1;

/**
 * @ClassName Citizen
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class Citizen {

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}
