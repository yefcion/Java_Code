package thisback;

public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我要娶 " + girl.getName());
    }

    public void shout() {
        if (age >= 22) {
            System.out.println("允许结婚");
        } else {
            System.out.println("年龄不够，不能结婚");
        }
    }
}
