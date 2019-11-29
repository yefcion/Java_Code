package data.controller;

import lombok.Data;
import java.io.Serializable;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/11/29 23:54
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6957361951748382519L;
    private String id;
    private String suborderNo;
    private String organUnitType;
    private String action;
    private String parent;
    private String organUnitFullName;
    private Long ordinal;
}