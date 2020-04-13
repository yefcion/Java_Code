package serialization;

import lombok.Data;

import java.io.Serializable;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.4.13 23:18
 */
@Data
public class Qing implements Serializable {
    private boolean sex;
    private int age;
    /**
     * 不进行序列化
     */
    private transient String hobbies;
}
