package itheima.day9.Text;

import java.util.ArrayList;

public class ArrayListText5 {
    /*
       需求: 定义一个方法, 方法接收一个集合对象（泛型为Student）
               方法内部将年龄低于18的学生对象找出
               并存入新集合对象, 方法返回新集合
    */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",15));
        list.add(new Student("李四",14));
        list.add(new Student("王五",20));
        ArrayList<Student>newlist = filter(list);
        System.out.println();
        for (int i = 0; i < newlist.size(); i++) {
            Student student = newlist.get(i);
            System.out.println(student.getName()+"------"+student.getAge());
        }
    }

    private static ArrayList<Student> filter(ArrayList<Student> list) {
        ArrayList<Student> newList =new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getAge()<18){
                newList.add(student);
            }

        }
        return newList;
    }
}
