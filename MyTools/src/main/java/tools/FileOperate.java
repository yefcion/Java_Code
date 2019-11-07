package tools;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/11/7 22:31
 */

public class FileOperate {

    /**
     * 创建文件
     *
     * @param path
     * @param fileName
     * @throws IOException
     */
    public void createFile(String path, String fileName) throws IOException {
        File file = new File(path + "/" + fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
    }


    /**
     * 删除文件
     *
     * @param path
     * @param fileName
     */
    public void delFile(String path, String fileName) {
        File file = new File(path + "/" + fileName);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    @Test
    public void fileTest() throws IOException {
        // 注：这里使用的是绝对路径
        String path = "D:\\";
        String fileName = "file_java.txt";
//        createFile(path, fileName);
        delFile(path, fileName);
    }

}
