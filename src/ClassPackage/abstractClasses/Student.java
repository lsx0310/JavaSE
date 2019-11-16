package ClassPackage.abstractClasses;

/**
 * @ClassName Student
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class Student extends Person{
    private String majar;

    public Student(String n,String m){
        super(n);
        majar = m;
    }

    @Override
    public String getDescription() {
        return "a student majaring in" + majar;
    }
}
