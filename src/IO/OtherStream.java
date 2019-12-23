package IO;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName OtherStream
 * @Description: TODO
 * 1.
 * 标准的输入、输出流
 * 1.1
 * System.in :标准的输入流，默认从键盘输入
 * System.out : 标准的输出流，默认从控制台输出
 * 1.2
 * System类的setIn(InputStream is) / setOut(PrintStream ps)方式重新指定输入和输出的地方
 *
 * @Authot li
 * @Date 2019/12/22
 * @Version v1.0
 **/

public class OtherStream {


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");

        BufferedReader br = new BufferedReader(isr);

        try {
            for (;;){
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

    }
}
