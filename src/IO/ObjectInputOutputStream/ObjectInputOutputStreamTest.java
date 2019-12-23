package IO.ObjectInputOutputStream;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName ObjectInputOutputStreamTest
 * @Description: TODO
 * 对象流的使用：
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.作用：用于存储和读取基本数据类型或对象的处理流。它的强大之处就是可以把Java中的对象存储到磁盘中。
 * @Authot li
 * @Date 2019/12/23
 * @Version v1.0
 **/

public class ObjectInputOutputStreamTest {
    /*
    * 序列化过程： 将内存中的Java对象保存到磁盘中或通过网络传输出去
    * 使用ObjectOutputStream实现
    * */

    @Test
    public void Test1(){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("我爱北京天安门"));

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                try {
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    * 反序列化：将磁盘或者网络传输过来的二进制流转换为Java的基本数据类型或对象
    * 使用ObjectInputStream实现
    * */
    @Test
    public void Test2() throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String s = (String) obj;
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }


    /*自定义对象的序列化和反序列化*/
    @Test
    public void Test3() throws IOException {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("PersonS.dat"));
            ois = new ObjectInputStream(new FileInputStream("Persons.dat"));


            oos.writeObject(new Person("li", 12));
            Person p1 = (Person) ois.readObject();
            System.out.println(p1);

            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            oos.close();
            ois.close();
        }
    }
}
