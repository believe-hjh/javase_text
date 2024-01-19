package anli;

public class Employee {
    private String name;
    private int age;
    private double scoer;
    public Employee(){}
    public Employee(String name, int age, double scoer) {
        this.name = name;
        this.age = age;
        this.scoer = scoer;
    }
    public void work(){
        System.out.println("员工工作");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return scoer
     */
    public double getScoer() {
        return scoer;
    }

    /**
     * 设置
     * @param scoer
     */
    public void setScoer(double scoer) {
        this.scoer = scoer;
    }


}
