package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class mystreamDemo7 {
       /*
            distinct            元素去重，依赖(hashCode和equals方法)
            concat              合并a和b两个流为一个流

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1,"张无忌", "周芷若", "周芷若", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");


        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, "周芷若", "赵敏", "张强");

        //distinct            元素去重，依赖(hashCode和equals方法)
        //arrayList1.stream().distinct().forEach(s -> System.out.println(s));

        //concat              合并a和b两个流为一个流
        Stream.concat(arrayList1.stream(),arrayList2.stream()).forEach(s -> System.out.println(s));
    }
}
