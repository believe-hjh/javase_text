package Text;

import org.w3c.dom.ls.LSOutput;

public class students extends Person{
    public double getScoer() {
        return scoer;
    }

    public void setScoer(double scoer) {
        this.scoer = scoer;
    }

    private double scoer;
    public students() {
    }

    public students(String name, int age,double scoer) {
        super(name, age);
    }
    public void Study(){
        System.out.println(" 姓名为"+super.getName()+", 年龄为"+super.getAge()+"岁, 成绩为"+scoer+"分的学生, 正在学习");
    }
}
