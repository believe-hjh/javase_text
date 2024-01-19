package itheima.day9.Text;

import java.util.ArrayList;

import itheima.day9.Text.Student;
public class ArraylistText2 {
    /*
       需求: 创建一个存储学生对象的集合,存储3个学生对象
                   在控制台, 展示出年龄低于18岁的学生信息
    */
    public static void main(String[] args) {
        Student s1 = new Student("张三",25);
        Student s2 = new Student("李四",17);
        Student s3 = new Student("王五",16);
        ArrayList <Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getAge()<18){
                System.out.println(student.name+"---"+student.age);
            }
        }

    }
}
