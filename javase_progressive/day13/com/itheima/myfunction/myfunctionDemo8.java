package day13.com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class myfunctionDemo8 {
    /*
     *   需求：
     *       创建集合添加学生对象
     *       学生对象属性：name，age
     *   要求：
     *       获取姓名并放到数组当中
     *       使用方法引用完成
     *
     *   技巧：
     *       1.现在有没有一个方法符合我当前的需求
     *       2.如果有这样的方法，这个方法是否满足引用的规则
     *       静态   类名：：方法名
     *       成员方法
     *       构造方法  类名：：new
     *
     *
     * */
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList();
        list.add(new student("张三",23));
        list.add(new student("李四",24));
        list.add(new student("王五",25));


        String[] students = list.stream().map(new Function<student, String>() {
            @Override
            public String apply(student student) {
                return student.getName();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(students));
    }
}
