package IO.Expr;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName PicTest
 * @Description: TODO
 * 图片的加密操作
 * @Authot li
 * @Date 2019/12/22
 * @Version v1.0
 **/

public class PicTest {

    /*图片的加密*/

    @Test
    public void PicUseInputStreamTest() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("IOSc.png");
            fos = new FileOutputStream("IODc.png");

            byte[] buffer = new byte[1024];
            int len;
            int b = 0;
            while ((len = fis.read(buffer)) != -1){

                for(int i = 0;i < len;i++){
                    buffer[i] = (byte) ( buffer[i] ^ 5);
                }
                fos.write(buffer, 0,len );
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
        }
    }
}