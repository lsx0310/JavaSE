package IO;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName InputStreamReader
 * @Description: TODO
 * 转换流（处理流的一种，这俩属于字符流 查看后缀!）
 * InputStreamReader : 将字节流转换为字符流
 * OutputStreamWriter : 将字符流转换为字节流
 *
 * 作用：提供字节流与字符流之间的转换
 *
 * 解码： 字节、字节数组-------> 字符，字符串
 * 编码:  字符，字符串------->  字节、字节数组
 *
 *
 * @Authot li
 * @Date 2019/12/22
 * @Version v1.0
 **/

public class InputStreamReaderTest {

    @Test
    public void IsrTest() throws IOException {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("笔记.txt");
            //参数2指明的转换的字符集
            isr = new InputStreamReader(fis, "UTF-8");

            char[] cbuf = new char[20];
            int len;

            while ((len = isr.read(cbuf)) != -1){
                String s = new String(cbuf);
                System.out.println(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            isr.close();
        }

    }

    /*
    * 综合使用InputStreamReader和OutputStreamWriter
    * 读取utf-8编码格式的文本文件，解码后，编码为GKB格式的文本文件*/
    @Test
    public void Test2() throws IOException {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;


        try {
            isr = new InputStreamReader(new FileInputStream("笔记.txt"), "UTF-8");

            osw = new OutputStreamWriter(new FileOutputStream("笔记GBK.txt"),"GBK");

            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1){
                osw.write(cbuf, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            isr.close();
            osw.close();
        }
    }
}
