package ClassPackage.abstractClasses;

/**
 * @ClassName PersonTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class PersonTest {

    public static void main(String[] args){
        Person[] people = new Person[2];

        people[0] = new Employee("Harry",5000,1989,10,1);
        people[1] = new Student("Morris","computer science");

        for (Person p : people){
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }

}
