package itheima.day9.Text;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrlistText3 {
    /*
      需求: 创建一个存储学生对象的集合, 存储3个学生对象, 使用程序实现在控制台遍历该集合
                  学生的姓名和年龄来自于键盘录入
   */
    public static void main(String[] args) {
        ArrayList<Student>list  =new ArrayList<>();
        for (int s =1;s<=3;s++) {
            extracted(list);
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }

    }

    private static void extracted(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        Student stu = new Student(name,age);
        list.add(stu);
    }
}
