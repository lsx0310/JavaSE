package MapTest;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName PropertiesTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/9
 * @Version v1.0
 **/

public class PropertiesTest {

    @Test
    public void Test() {
        Properties prop = new Properties();
        FileInputStream fls = null;

        try {
            fls = new FileInputStream("jdbc.properties");

            prop.load(fls);

            String name = prop.getProperty("name");
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fls != null){
                try {
                    fls.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
