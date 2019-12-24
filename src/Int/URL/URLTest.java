package Int.URL;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName URLTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/24
 * @Version v1.0
 **/

public class URLTest {

    @Test
    public void Test() throws IOException {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;

        try {
            URL url = new URL("http://localhost:8888/examples/111.txt");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("用完删除.txt");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            is.close();
            urlConnection.disconnect();
        }


    }
}
