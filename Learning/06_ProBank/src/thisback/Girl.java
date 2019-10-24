package thisback;

public class Girl {
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

    public void marry(Boy boy) {
        System.out.println("我要嫁给 " + boy.getName());
        boy.marry(this);                            //被调对象的
    }

    public void shout() {
        if (age >= 22) {
            System.out.println("允许结婚");
        } else {
            System.out.println("年龄不够，不能结婚");
        }
    }
}
