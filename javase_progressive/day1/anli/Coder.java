package anli;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, int age, double scoer) {
        super(name, age, scoer);
    }

    @Override
    public void work() {
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getScoer()+"的员工正在编写代码");
    }
}
