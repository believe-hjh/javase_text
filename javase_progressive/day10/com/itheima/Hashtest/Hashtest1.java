package day10.com.itheima.Hashtest;

public class Hashtest1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);


        System.out.println(s1.hashCode());//1324119927
        System.out.println(s2.hashCode());//990368553


        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }


}
