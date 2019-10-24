package application;

import org.junit.Test;
import tools.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： xu.yefcion
 * @description： 判断一个点是否在多边形内部 - 射线法思路 https://blog.csdn.net/qq_27161673/article/details/52973866
 * @date： 2019/10/24 22:11
 */
public class Polygon {

    public void inPolygon(Point p, List<Point> poly) {
        int nMix = 0;
        for (int i = 0; i < poly.size(); i++) {
            double py = p.getY();
            double px = p.getX();
            double p1y = poly.get(i).getY();
            double p2y = poly.get(i+1).getY();

            if (p1y == p2y){
                continue;
            }
            if (py<p1y && py<p2y){
                continue;
            }
            if (py>p1y && py>p2y){
                continue;
            }
        }
    }

    @Test
    public void inPolygonTest(){
        Point p = new Point(10.3, 23.7);
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 50);
        Point p3 = new Point(50, 50);
        Point p4 = new Point(75, 25);
        Point p5 = new Point(50, 0);

        List<Point> poly = new ArrayList<Point>();
        poly.add(p1);
        poly.add(p2);
        poly.add(p3);
        poly.add(p4);
        poly.add(p5);
    }
}
