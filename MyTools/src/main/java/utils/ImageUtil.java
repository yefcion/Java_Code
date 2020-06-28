package utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/24 22:03
 */

public class ImageUtil {

    /**
     * 从本地读取图片，转 base64 编码
     *
     * @param path
     * @return
     */
    public static String img2base64Local(String path) {
        InputStream picIn;
        byte[] data = new byte[0];

        // 读取图片字节数组
        try {
            picIn = new FileInputStream(path);
            data = new byte[picIn.available()];
            picIn.read(data);
            picIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return byte2str(data);
    }

    /**
     * 从网络读取图片，转 base64 编码
     *
     * @param imgUrl
     * @return
     */
    public static String img2base64Net(String imgUrl) {
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        // Generate url
        try {
            URL url = new URL(imgUrl);
            byte[] bytes = new byte[0];
            // Generate link
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(500);
            InputStream urlPic = conn.getInputStream();
            // read pic to stream
            int len = -1;
            while (-1 != (len = urlPic.read(bytes))) {
                data.write(bytes, 0, len);
            }
            urlPic.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return byte2str(data.toByteArray());
    }

    public static boolean base642img(String picBase, String imgPath) {
        if (isEmpty(picBase)) {
            return false;
        }

        Decoder decoder = Base64.getDecoder();
        try {
            byte[] bytes = decoder.decode(picBase);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {
                    bytes[i] += 256;
                }
            }
            OutputStream outPic = new FileOutputStream(imgPath);
            outPic.write(bytes);
            outPic.flush();
            outPic.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 对字节数组进行 base64 编码
     *
     * @param bytes
     * @return
     */
    public static String byte2str(byte[] bytes) {
        Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(bytes);
    }

    /**
     * 验证字符串是否为空
     *
     * @param input
     * @return
     */
    public static boolean isEmpty(String input) {
        return input == null || input.equals("");
    }
}
