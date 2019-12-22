package IO.BufferedIO;


import org.junit.Test;

import java.io.*;

/**
 * @ClassName BufferedTest
 * @Description: TODO
 * 使用缓冲流（处理流的一种）：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedWriter
 * BufferedReader
 *
 * 作用：
 *     提高流的读取，写入的速度
 *     原因：内部提供了一个缓冲区
 *
 *
 *     处理流：套在流外的一种流
 * @Authot li
 * @Date 2019/12/20
 * @Version v1.0
 **/

public class BufferedTest {


    /*
    使用缓冲流实现一个非文本文件的复制
    * */

    public void copyUseBuffered(String srcPath,String descPath) {

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            File srcFile = new File(srcPath);
            File descFile = new File(descPath);

            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(descFile));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /*
    使用缓冲流实现一个文本文件的复制
    * */
    public void copyFileUseBuffered(String srcPath,String descPath) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            File srcFile = new File(srcPath);
            File descFile = new File(descPath);

            bufferedReader = new BufferedReader(new FileReader(srcFile));
            bufferedWriter = new BufferedWriter(new FileWriter(descFile));

            //方式一
//            char[] buffer = new char[1024];
//            int len;
//            while ((len = bufferedReader.read(buffer)) != -1){
//                for (int i = 0;i < len;i++) {
//                    bufferedWriter.write(buffer[i]);
//                }
//            }
            //方式二
            String data;
            while ((data = bufferedReader.readLine()) != null){
                //方式一
//                bufferedWriter.write(data);//data 中不包含换行符
//                bufferedWriter.newLine();
                //方式二
                bufferedWriter.write(data + "\n");


            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void Test1(){

        String srcPath = "IO.png";
        String descPath = "IOBCopy.png";

        long start = System.currentTimeMillis();

        copyUseBuffered(srcPath, descPath);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
