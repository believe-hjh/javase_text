package day10.com.itheima.set;

import day5.object.Student;

import java.util.TreeSet;

public class TreesetDEmo2 {
    public static void main(String[] args) {
        TreeSet<Student> st = new TreeSet<>();
        st.add(new Student("张三",23));
        st.add(new Student("李四",24));
        st.add(new Student("王五",25));
        st.add(new Student("赵六",26));
        System.out.println(st);

    }
}
