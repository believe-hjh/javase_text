package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class mystreamDemo6 {
     /*
            filter              过滤
            limit               获取前几个元素
            skip                跳过前几个元素

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        //filter   过滤  把张开头的留下，其余数据过滤不要
//        arrayList.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                //如果返回true，表示当前数据留下
//                //如果赶回false，表示当前数据舍弃
//                return s.startsWith("张");
//            }
//        }).forEach(s -> System.out.println(s));
//        Stream<String> stream1 = arrayList.stream().filter(s -> s.startsWith("张"));
//        Stream<String> Stream2 = stream1.filter(s -> s.length() == 3);
//        Stream2.forEach(s -> System.out.println(s));

        //
        // limit               获取前几个元素
        //  skip                跳过前几个元素
//        arrayList.stream().limit(3)
//                .forEach(s -> System.out.println(s));
//          arrayList.stream().skip(4)
//                  .forEach(s -> System.out.println(s));
            //练习  "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
            //"张强", "张三丰", "张翠山"
        //方法1:先获取前六个，再取得前三个
//        arrayList.stream().limit(6)
//                .skip(3)
//                .forEach(s -> System.out.println(s));
        //方法2:先跳过前三个，在获取前三个
          arrayList.stream().skip(3)
                  .limit(3)
                  .forEach(s -> System.out.println(s));

    }
}
