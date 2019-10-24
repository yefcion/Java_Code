package practice;

public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (getSex()==1){
            System.out.println("man");
        }else if(getSex()==0){
            System.out.println("woman");
        }else{
            System.out.println("middle");
        }
    }
    public void employeed(){
        if (getSalary()<=0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}
