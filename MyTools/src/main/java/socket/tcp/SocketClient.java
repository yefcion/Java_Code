package socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author： xu.yefcion
 * @description： 在运行时，若先执行SocketClient会提示无法连接到服务器，因为此时没有服务在监听8088端口。此demo是多线程实现，在先启动SocketServer后，服务器会一直监听8088端口，再执行SocketClient就会正常输出结果。
 * @date： 2020.7.12 22:35
 */

public class SocketClient {
    public static void main(String[] args) {
        try {
            // 和服务器创建连接
            Socket socket = new Socket("localhost", 8088);

            // 要发送给服务器的消息
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("客户端发送消息");
            pw.flush();

            // 从服务器接收的消息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("我是客户端，服务端返回信息：" + info);
            }

            br.close();
            is.close();
            os.close();
            pw.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
