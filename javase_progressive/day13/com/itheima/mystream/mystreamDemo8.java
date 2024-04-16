package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class mystreamDemo8 {
    /*
            map                 转换流中的数据类型

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");

        //需求：只获取里面的年龄并打印
        //第一个:流中原本的类型
        //第二个:转换后的类型
       arrayList.stream().map(new Function<String, Integer>() {
           @Override
           public Integer apply(String s) {
               String[] split = s.split("-");
               String s1 = split[1];
               int i = Integer.parseInt(s1);
               return i;
           }
       }).forEach(s-> System.out.println(s));


        System.out.println("---------------------------------------------");

        arrayList.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
