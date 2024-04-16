package day10.com.itheima.Hashtest;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",23);


        HashSet<Student> ht = new HashSet<>();


        System.out.println(ht.add(s1));
        System.out.println(ht.add(s2));
        System.out.println(ht.add(s3));
        System.out.println(ht.add(s4));


        System.out.println(ht);

    }
}
