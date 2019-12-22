package IO;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName FileTest
 * @Description: TODO
 *三种构造方法：
 * File(String FilePath)
 * File(String parentPath,String childPath)
 * File(File parent,String child)
 *
 *
 * File类涉及到文件或文件目录的创建，删除，重命名，修改时间等
 * 但并未设计文件内容的修改。
 * 如果需要读取或写入文件内容，必须使用IO流来完成
 * 后续File的类对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”。
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class FileTest {

    String filePath = "hello.txt";
    String absFilePath = "D:\\workspaces\\Gitspace\\JavaSE\\src\\IO";

    @Test
    public void Test1(){
        File file = new File(filePath);
    }

    /*
    * File 的获取功能*/

    @Test
    public void Test2(){
        File file1 = new File(filePath);
        File file2 = new File(absFilePath);

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

    }

    @Test
    public void Test3(){
        File file = new File("D:\\workspaces\\Gitspace\\JavaSE");

        String[] fileString = file.list();
        for (String s : fileString){
            System.out.println(s);
        }
    }

    @Test
    public void Test4(){
        File file = new File("D:\\workspaces\\Gitspace\\JavaSE");

        File[] filePath = file.listFiles();
        for (File f : filePath){
            System.out.println(f);
        }
    }

    /*public boolean renameTo(File dest)；把文件重命名为指定的文件路径
    比如：file1.renameTo(file2)
    要想保证返回为true,1 保证file1在硬盘中存在 2 保证file2在硬盘中不存在
    * */
    @Test
    public void Test5(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\workspaces\\Gitspace\\JavaSE\\src\\IO\\hi.txt");
    }

    /*
    * 判断是否存在*/

    @Test
    public void Test6(){
        File file1 = new File("hello.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canWrite());
        System.out.println(file1.canRead());
        System.out.println(file1.isHidden());
    }

    /*
    * 创建
    * 删除功能
    * Java中删除不走垃圾回收站*/

    @Test
    public void Test7() throws IOException {
        File file1 = new File("hello.txt");
        System.out.println(file1.createNewFile());

        file1.mkdir();    //创建文件目录。若父目录不存在则不创建
        file1.mkdirs();   //创建文件目录。若父目录不存在则创建父目录后再创建
    }
}
