package data.controller;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/11/30 0:05
 */
@Data
public class ErrorTypeMe implements Serializable {
    private static final long serialVersionUID = -432908543160176349L;
    private String code;
    private String message;
    private String success;
    private List<User> user = new ArrayList<>();
}
