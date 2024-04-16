package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class mystreamDemo1 {
     /*
            创建集合添加元素，完成以下需求：
            1.把所有以“张”开头的元素存储到新集合中
            2.把“张”开头的，长度为3的元素再存储到新集合中
            3.遍历打印最终结果
        */
     public static void main(String[] args) {
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("张大三");
         arrayList.add("李四");
         arrayList.add("王五");
         arrayList.add("赵六");
         arrayList.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
//         //把“张”开头的元素再存储到新集合中
//         ArrayList<String>arrayList1 = new ArrayList<>();
//         for (String s : arrayList) {
//             if(s.startsWith("张")){
//                 arrayList1.add(s);
//             }
//         }
//         //长度为3的元素再存储到新集合中
//         ArrayList<String>arrayList2 = new ArrayList<>();
//         for (String name : arrayList1) {
//             if(name.length()==3){
//                 arrayList2.add(name);
//             }
//         }
//         //3.遍历打印最终结果
//         for (String name1 : arrayList2) {
//             System.out.println(name1);
//         }
     }



}
