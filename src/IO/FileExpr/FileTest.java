package IO.FileExpr;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FileTest
 * @Description: TODO
 * @Authot li
 * @Date 2019/12/18
 * @Version v1.0
 **/

public class FileTest {

    File file = new File("IOTest");

    @Test
    public void Test1() throws IOException {

        if (!file.exists()){
            file.mkdir();
        }

        File file1 = new File(file.getAbsolutePath(),"Test1");
        File file2 = new File(file.getAbsoluteFile(),"test.txt");
        File file3 = new File(file.getAbsoluteFile(),"1.jpg");
        File file4 = new File(file.getAbsoluteFile(),"2.jpg");

        file1.mkdir();
        file2.createNewFile();
        file3.createNewFile();
        file4.createNewFile();
    }


    @Test
    public void Test2(){
        System.out.println(delete("test.txt"));
    }

    @Test
    public void Test3(){

        List<String> filesName = getJpgName("IOTest");
        for (String s : filesName){
            System.out.println(s);
        }

    }

    @Test
    public void Test4(){
        getAllFileName(file);
        System.out.println("遍历完毕");
        System.out.println();
        deleteAllFiles(file);
        getAllFileName(file);
    }




    public boolean delete(String fileName) {
        File deleteFile = new File(file, fileName);
        if (deleteFile.exists()) {
            deleteFile.delete();
        }
        return !deleteFile.exists();
    }

    public List<String> getJpgName(String filePath){
        File targetFile = new File(filePath);
        String[] fileString = targetFile.list();

        List<String> list = Arrays.asList(fileString);
        List<String> res = new ArrayList<>();
        for (String s : list){
            String[] splitString = s.split("\\.");
            int length = splitString.length;
            if (length>0 && "jpg".equals(splitString[length - 1])){
                res.add(splitString[0]);
            }
        }
        return res;
    }

    public void getAllFileName(File filePath){
        File[] filesName = filePath.listFiles();

        List<File> list = Arrays.asList(filesName);

        for (File f : list){
            System.out.println(f.getName());
            if (f.isDirectory()){
                getAllFileName(f);
            }
        }
        System.out.println(filesName.length);
    }

    public void deleteAllFiles(File filePath) {
        File[] filesName = filePath.listFiles();

        List<File> list = Arrays.asList(filesName);

        for (File f : list) {
            f.delete();
            if (f.isDirectory()) {
                deleteAllFiles(f);
                f.delete();
            }
        }

    }
}
