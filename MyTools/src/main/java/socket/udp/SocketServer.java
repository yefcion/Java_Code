package socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.7.12 23:14
 */

public class SocketServer {
    public static void main(String[] args) {
        try {
            // 要接收的报文
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

            // 创建 socket 并指定端口
            DatagramSocket socket = new DatagramSocket(8088);

            // 接收 socket 客户端发送的数据，如果未收到会一致阻塞
            socket.receive(packet);
            String receiveMsg = new String(packet.getData(), packet.getOffset(), packet.getLength());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
