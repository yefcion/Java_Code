package tools;

import lombok.Data;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/24 22:11
 */
@Data
public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
