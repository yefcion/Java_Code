package socket.tcp;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author： xu.yefcion
 * @description：JAVA Socket详解 https://blog.csdn.net/u014209205/article/details/80461122
 * @date： 2020.7.12 22:47
 */

public class SocketServer {
    public static void main(String[] args) {
        try {
            // 创建服务器 socket
            ServerSocket serverSocket = new ServerSocket(8088);

            // 创建客户端 socket
            Socket socket = new Socket();

            // 循环监听客户端的连接
            while (true) {
                // 监听客户端
                socket = serverSocket.accept();

                ServerThread thread = new ServerThread(socket);
                thread.start();

                InetAddress addr = socket.getInetAddress();
                System.out.println("当前客户端 IP："+addr.getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
