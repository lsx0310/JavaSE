package ClassPackage.Inheritance;

/**
 * @ClassName ManagerTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/11/12
 * @Version v1.0
 **/

public class ManagerTest {

    public static void main(String[] args){
        Manager boss = new Manager("Carl Cracker",80000,1989,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry",50000,1989,10,1);
        staff[2] = new Employee("Tommy",40000,1990,3,15);

        for (Employee e : staff){
            System.out.println("name = " + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
