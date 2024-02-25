package text.demo;

import text.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDome {
    public static void main(String[] args) {
        Student stu1 = new Student("hei001",23,"张三","2002-03-12");
        Student stu2 = new Student("hei002",22,"李四","2001-1-1");
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        String id = "hei009";
        int index = getIndex(id, list);
        System.out.println(index);
    }

    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getId().equals(id)){
                return i;
            }
            }
       return -1;
    }


}