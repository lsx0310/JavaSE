package IO;

import jdk.management.resource.internal.ResourceNatives;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName RandomAccessFileTest
 * @Description: TODO
 * RandomAccessFile的使用：
 *      1.RandomAccessFile继承与Object类，实现了DataInput和DataOutput接口
 *      2.RandomAccessFile既可以作为一个输入流又可以作为一个输出流
 *      3.RandomAccessFile单纯作为一个输出流的时候，如果写入的文件不存在，则创建文件
 *              若文件存在，则覆盖原文件（默认从头覆盖）
 *
 *      4.可以通过相关操作，实现插入操作
 * @Authot li
 * @Date 2019/12/23
 * @Version v1.0
 **/

public class RandomAccessFileTest {

    @Test
    public void Test1() throws IOException {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;

        try {
            raf1 = new RandomAccessFile("IO.png", "r");
            raf2 = new RandomAccessFile("IOACCESS.png", "rw");


            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            raf1.close();
            raf2.close();
        }
    }

    @Test
    public void Test2(){
        RandomAccessFile raf1 = null;

        try {
            raf1 = new RandomAccessFile("Hello.txt", "rw");

            raf1.write("111111".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try{
               raf1.close();
           }catch (IOException e){
               e.printStackTrace();
           }
        }
    }

    /*使用RandomAccessFile实现文本文件的插入功能
    * */
    @Test
    public void Test3() throws IOException {
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile("Hello.txt","rw");

            raf.seek(2);

            StringBuilder builder = new StringBuilder((int) new File("Hello.txt").length());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf.read(buffer)) != -1){
                builder.append(new String(buffer, 0, len));
            }

            raf.seek(2);
            raf.write("very".getBytes());
            raf.write(builder.toString().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            raf.close();
        }
    }
}
