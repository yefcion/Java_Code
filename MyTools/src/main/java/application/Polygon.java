package application;

import org.junit.Test;
import tools.Point;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * @author： xu.yefcion
 * @description： 判断一个点是否在多边形内部 - 射线法思路 https://blog.csdn.net/qq_27161673/article/details/52973866
 * @date： 2019/10/24 22:11
 */
public class Polygon {

    public void inPolygon(Point p, List<Point> poly) {
        int nMix = 0;
        for (int i = 0; i < poly.size(); i++) {
            int j = (i + 1) % poly.size();
            double py = p.getY();
            double px = p.getX();
            double p1y = poly.get(i).getY();
            double p1x = poly.get(i).getX();
            double p2y = poly.get(j).getY();
            double p2x = poly.get(j).getX();

            if (p1y == p2y) {
                continue;
            }
            if (py < min(p1y, p2y)) {
                continue;
            }
            if (py > max(p1y, p2y)) {
                continue;
            }
            Double x = (p1y - py) / (p1y - p2y) * (p2x - p1x) + p1x;
            if (x > px) {
                nMix++;
            }
        }
        if (nMix % 2 == 1) {
            System.out.println("the point " + p + " is in the polygon");
        } else {
            System.out.println("the point " + p + " is out of the polygon");
        }
    }

    @Test
    public void inPolygonTest() {
        Point p = new Point(70.3, 43.7);
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

        inPolygon(p, poly);
    }
}
