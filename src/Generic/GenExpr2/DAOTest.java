package Generic.GenExpr2;

import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @ClassName DAOTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class DAOTest {

    User user = new User(1,12,"Li");
    DAO<User> daoUser = new DAO<>();

    @Test
    public void main(){
        daoUser.save("1",user);
        User user1 = daoUser.get("1");
        System.out.println(user1);
        daoUser.update("2",new User(2,13,"pan"));
        daoUser.delete("1");
        List<User> list = daoUser.list();
        for (User user : list){
            System.out.println(user);
        }
        list.forEach(System.out::println);
    }
}
