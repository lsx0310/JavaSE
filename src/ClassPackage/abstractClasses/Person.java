package ClassPackage.abstractClasses;

/**
 * @ClassName Person
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}
