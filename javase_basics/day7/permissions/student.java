package itheima.day7.permissions;

public class student {
    private int age;
    public void sa(int age){
        if(age>=1&&age<=120){
            this.age=age;
        } else {
            System.out.println("baiabi");
        }
    }
    public int getAge(){
        return age;
    }
}
