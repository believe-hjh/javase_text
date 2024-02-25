package Text;

public class Teach extends Person {
    public Teach() {
    }

    public Teach(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println("姓名为"+super.getName()+", 年龄为"+super.getAge()+"岁的老师正在讲课");
    }
}
