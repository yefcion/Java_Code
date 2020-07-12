package socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.7.12 22:36
 */

public class SocketClient {
    public static void main(String[] args) {
        try {
            // 要发送的消息
            String sendMessage = "客户端发送的消息";

            // 获取服务器的地址
            InetAddress addr = InetAddress.getByName("localhost");

            // 创建 package 包对象，封装要发送的包数据和服务器地址和端口号
            DatagramPacket packet = new DatagramPacket(sendMessage.getBytes(),sendMessage.getBytes().length,addr,8088);

            // 创建 socket 对象
            DatagramSocket socket = new DatagramSocket();

            // 发送消息到服务器
            socket.send(packet);

            // 关闭 socket
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
