package day13.com.itheima.myfunction;

import java.util.ArrayList;

public class myfunctionDemo9 {
    /*
     *   需求：
     *       创建集合添加学生对象
     *       学生对象属性：name，age
     *   要求：
     *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
     *       使用方法引用完成
     * */


    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("zhangsan",23));
        list.add(new student("lisi",24));
        list.add(new student("wangwu",25));


        String[] studentStrings = list.stream()
                .map(student -> student.getName() + "-" + student.getAge())
                .toArray(String[]::new);

        // 打印数组内容以验证结果
        for (String studentString : studentStrings) {
            System.out.println(studentString);
        }

    }
}
