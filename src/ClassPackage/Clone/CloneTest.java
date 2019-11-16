package ClassPackage.Clone;

/**
 * @ClassName CloneTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/17
 * @Version v1.0
 **/

public class CloneTest {

    public static void main(String[] args) {

        Employee original = new Employee("harry", 15000);
        original.setHireDay(2000, 1, 1);

        try {
            Employee copy = original.clone();
            copy.setHireDay(1999, 2, 1);
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
