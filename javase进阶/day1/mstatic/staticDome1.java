package day1.mstatic;

public class staticDome1 {
    /*
       static 关键字 : 修饰符, 可以修饰成员变量, 成员方法

       特点:
               1. 被类的所有对象所共享
               2. 多了一种调用方式, 可以通过类名进行调用 (推荐使用类名调用)
               3. 随着类的加载而加载, 优先于对象存在
    */
    public static void main(String[] args) {
        Student.school = "陕西";
        Student s1 = new Student();
        s1.name="张三";
        s1.age = 20;
        System.out.println(s1.name+"---"+s1.age+"---"+s1.school);
        Student s2 = new Student();
        s2.name="李四";
        s2.age = 19;
        System.out.println(s2.name+"---"+s2.age+"---"+s2.school);

    }
}
