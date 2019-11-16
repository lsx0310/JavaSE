package ClassPackage.equals;

/**
 * @ClassName EmployeeTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/15
 * @Version v1.0
 **/

public class EmployeeTest {

    public static void main(String[] args){
        Employee alice1 = new Employee("Alice Adamas",75000,1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adamas",75000,1987,12,15);
        Employee bob = new Employee("Bob",50000,1989,10,1);

        System.out.println("alice1 == alice2 : " + (alice1==alice2));
        System.out.println("alice1 == alice3 : " + (alice1==alice3));
        System.out.println("alice1.equals(alice3) : " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob) : " + alice1.equals(bob));
        System.out.println(bob.toString());

        Manager carl = new Manager("Carl Cracker",8000,1989,12,12);
        Manager boss = new Manager("Carl Cracker",8000,1989,12,12);
        boss.setBonus(500);
        System.out.println(boss.toString());
        System.out.println("carl.equals(boss) : " + carl.equals(boss));
        System.out.println("Alices1.hashcode = " + alice1.hashCode());
        System.out.println("Alices3.hashcode + " + alice3.hashCode());
        System.out.println("bob.hashcode = " + bob.hashCode());
        System.out.println("carl.hashcode = " + carl.hashCode());

    }
}
