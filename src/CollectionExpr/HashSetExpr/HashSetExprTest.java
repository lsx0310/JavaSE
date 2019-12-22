package CollectionExpr.HashSetExpr;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName HashSetExprTest
 * @Description: TODO    读取文本中的数据存入map中
 * @Authot li
 * @Date 2019/12/10
 * @Version v1.0
 **/

public class HashSetExprTest {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\li\\Desktop\\NameTest.txt";
        HashMap<String,Integer> map = new HashMap<>();

        BufferedReader reader = null;


        try {
            reader = new BufferedReader(new FileReader(filePath));
            String value = null;
            String temp = null;
            StringBuilder builder = new StringBuilder();

            while ((value = reader.readLine()) != null){
                builder.append(value.split(" ")[0]);
                temp = builder.toString();
                if (map.containsKey(temp)){
                    int count = map.get(temp);
                    map.put(temp,count + 1);
                }else {
                    map.put(temp,1);
                }
                builder.delete(0,builder.length());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }


        Set NodeSet = map.entrySet();
        Iterator iterator = NodeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
