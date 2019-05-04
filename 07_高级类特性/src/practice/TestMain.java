package practice;

public class TestMain {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(1);
        someKid.setYearsOld(23);
        someKid.setSalary(9);
        someKid.printAge();
        someKid.employeed();

        Cylinder c = new Cylinder();
        c.setRadius(3);
        c.setLength(5);
        System.out.println("圆柱的表面积：" + c.findArea());
        System.out.println("圆柱的体积为：" + c.findVolume());
    }
}
