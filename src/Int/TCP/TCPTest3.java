package Int.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName TCPTest3
 * @Description: TODO
 * 例子3：
 * 客服端向服务器端发送文件，服务端接受并返回图片已收到。
 * @Authot li
 * @Date 2019/12/23
 * @Version v1.0
 **/

public class TCPTest3 {


    /*
    * 客户端*/
    @Test
    public void Client() throws IOException {
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream ops = null;
        InputStream ips = null;
        BufferedInputStream bips = null;
        BufferedOutputStream bops = null;
        ByteArrayOutputStream baos = null;

        try {
            socket = new Socket(inet,8899);
            fis = new FileInputStream("IO.png");
            ops = socket.getOutputStream();
            bips = new BufferedInputStream(fis);
            bops = new BufferedOutputStream(ops);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bips.read(buffer)) != -1){
                bops.write(buffer, 0, len);
            }
            bops.flush();
            socket.shutdownOutput();

            ips = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            while ((len = ips.read(buffer)) != -1){
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bops.close();
            ops.close();
            bips.close();
            fis.close();
            socket.close();
            ips.close();
            baos.close();

        }
    }

    /*服务端*/
    @Test
    public void services() throws IOException {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream ips = null;
        OutputStream ops = null;
        FileOutputStream fos = null;
        BufferedInputStream bips = null;
        BufferedOutputStream bops = null;

        try {
            ss = new ServerSocket(8899);
            socket = ss.accept();
            ips = socket.getInputStream();
            fos = new FileOutputStream("IOTCPTest1.png");
            bips = new BufferedInputStream(ips);
            bops = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bips.read(buffer)) != -1){
                bops.write(buffer, 0, len);
            }


            ops = socket.getOutputStream();
            ops.write("图片已收到".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bops.close();
            bips.close();
            fos.close();
            ips.close();
            socket.close();
            ss.close();
            ops.close();
        }


    }
}
