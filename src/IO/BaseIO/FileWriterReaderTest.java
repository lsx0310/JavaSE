package IO.BaseIO;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FileWriterReaderTest
 * @Description: TODO
 * 流的分类：
 * 按操作数据单位：字节流（8bit 非文本）、字符流（16bit 文本）
 * 数据流向：输入流、输出流
 * 流的角色：节点流、处理流
 *
 *
 * 流的体系结构
 * 抽象基类                   节点流(或文件流)                缓冲流（处理流的一种）
 * Reader                   FileReader                  BufferReader
 * Writer                   FileWriter                  BufferWriter
 * InputStream              FileInputStream             BufferInputStream
 * OutputStream             FileOutputStream            BufferOutputStream
 * @Authot li
 * @Date 2019/12/19
 * @Version v1.0
 **/

public class FileWriterReaderTest {

    @Test
    public void Test1() throws FileNotFoundException {
        //实例化的File对象，指要操作的文件        读入文件需存在
        File file = new File("Hello.txt");

        //提供具体的流
        FileReader fileReader = new FileReader(file);

        try {
            //数据的读入
            //read()返回读入的一个字符，如果到达文件末尾，返回-1
            //方式一
//            int data = fileReader.read();
//            while (true){
//                System.out.println((char)data);
//                data = fileReader.read();
//            }
            //方式二   语法上的修改
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)     //防止流未创建，若未创建会空指针
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //reader()方法 重载、升级
    @Test
    public void Test2() throws IOException {

        FileReader reader = null;
        try {
            File file = new File("Hello.txt");

            reader = new FileReader(file);

            char[] cbuf = new char[5];
            int len;
            //read(cbuf) 返回的读入到cbuf中的字符长度;
            //方式一
            while ((len = reader.read(cbuf)) != -1) {
                //方式一
//                for (int i = 0; i < len;i++){
//                    System.out.println(cbuf[i]);
//                }
                //方式二
                String s = new String(cbuf, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    /*从内存往硬盘里写
      初始文件不存在的话，会先创建再写入
    * */
    @Test
    public void fileWriterTest() throws IOException {
        FileWriter fileWriter = null;

        try {
            File file = new File("Hello.txt");

            fileWriter = new FileWriter(file, true);


            fileWriter.write("i love shanghai");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }


    @Test
    public void fileReaderWriterTest() throws IOException {

        FileWriter fileWriter = null;
        FileReader fileReader = null;
        int len;
        String s = "";

        try {
            File file1 = new File("Hello.txt");
            File file2 = new File("HelloCopy.txt");
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2, true);

            char[] cbuf = new char[5];

            while ((len = fileReader.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    s += cbuf[i];
                }
            }

            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
            fileWriter.close();
        }
    }

}
