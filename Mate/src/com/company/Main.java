package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");

        Mate m1 = new Mate();
        m1.Minfo();

    }
}

class Mate{
    private String name = "长泽雅美";
    private int height = 160;
    private int weight = 50;
    private String hobby = "Book Movie";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void Minfo(){
        System.out.println("My girl is "+this.getName()+
                "\n"+this.getHeight()+"cm "+this.getWeight()+"kg"+
                "\nShe likes "+this.getHobby()+
                "\n\nmy good girl"
        );
    }
}