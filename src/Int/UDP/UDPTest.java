package Int.UDP;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName UDPTest
 * @Description: TODO
 * UDP协议的网络编程
 * @Authot li
 * @Date 2019/12/24
 * @Version v1.0
 **/

public class UDPTest {

    /*发送端*/
    @Test
    public void sender() throws IOException {

        DatagramSocket socket = new DatagramSocket();
        InetAddress inet = InetAddress.getLocalHost();
        try {
            byte[] buffer = null;
            buffer = "我是UDP发送的导弹".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length,inet,9999);
            socket.send(packet);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }

    }

    /*接收端*/
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buffer = new byte[1024];
        try {
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
            socket.receive(packet);

            System.out.println(new String(packet.getData(),0,packet.getLength()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
