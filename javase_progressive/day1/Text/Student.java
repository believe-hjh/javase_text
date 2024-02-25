package Text;

public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // 创建学生对象并为其赋值
        Student student1 = new Student("张三", 20);

        // 显示学生信息
        student1.displayInfo();
    }
}
