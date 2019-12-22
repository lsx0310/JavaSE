package IO.BaseIO;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName FileInputOutputStreamTest
 * @Description:
 * 测试 FileInputStream  FileOutputStream
 * 读取文本文件(.txt;.java;.c;.c++)使用FileReader 可以避免乱码  （字符流）
 * 单纯复制文本文件  不在内存层面查看使用字节流也可以
 * 非文本文件(.jpg;.mp3;.mp4;.avi;.doc;.ppt) 使用字节流
 * @Authot li
 * @Date 2019/12/20
 * @Version v1.0
 **/

public class FileInputOutputStreamTest {

    /*
    复制图片
    * */

    @Test
    public void InputOutputStreamTest() throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        long start = System.currentTimeMillis();

        try {
            File file1 = new File("IO.png");
            File file2 = new File("IOCopy.png");

            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);

            byte[] bytesbuf = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytesbuf)) != -1) {
                fileOutputStream.write(bytesbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


    /*
    * 指定路径下的文件复制*/

    public void copyFile(File srcFile,File decFile)  {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(decFile);

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }

            try {
                fileOutputStream.close();;
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void copyFileTest(){
        File file1 = new File("IO.png");
        File file2 = new File("IOCopy.png");

        copyFile(file1, file2);
    }
}
