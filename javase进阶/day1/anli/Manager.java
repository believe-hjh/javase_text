package anli;

public class Manager extends Employee{
    public double getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }

    private double jiangjin;

    public Manager() {
    }

    public Manager(String name, int age, double scoer,double jiangjin) {
        super(name, age, scoer);
        this.jiangjin=jiangjin;
    }
    public void work(){
        System.out.println("姓名为"+super.getName()+"年龄为"+super.getAge()+"工资为"+super.getScoer()+",奖金为"+jiangjin+"的项目经理正在编写代码");
    }
}
