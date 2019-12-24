package Int.TCP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TCPTest1
 * @Description: TODO
 * 实现TCP的网络编程
 * 例子1：
 * 实现客户端向服务端发送数据，服务端将内容打印在控制台
 *
 * @Authot li
 * @Date 2019/12/23
 * @Version v1.0
 **/

public class TCPTest1 {


    /*客户端*/
    @Test
    public void client(){

        Socket socket = null;
        OutputStream ops = null;

        try {
            //创建socket对象，指明服务器端的IP和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);

            //获取一个输出流，用于输出数据
            ops = socket.getOutputStream();
            //写数据操作
            ops.write("我是客户端".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ops != null){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /*服务端*/
    @Test
    public void service() throws IOException {

        //创建服务器端的socket，指明自己的端口号
        ServerSocket ss = new ServerSocket(8899);
        Socket socket = null;
        InputStream ips = null;
        ByteArrayOutputStream baos = null;

        try {
            socket = ss.accept();

            ips = socket.getInputStream();

            //不建议，可能会出现乱码
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = ips.read(buffer)) != -1){
//            String s = new String(buffer, 0, len);
//            System.out.println(s);
//        }

            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = ips.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }

            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            baos.close();
            ips.close();
            socket.close();
        }


    }
}
