package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class mystreamDemo9 {
     /*
            void forEach(Consumer action)           遍历
            long count()                            统计
            toArray()                               收集流中的数据，放到数组中
       */

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
//        void forEach(Consumer action)           遍历
//        Consumer的泛型：表示流中数据的类型
//        accept的形参s：表示流里面的每一个数据
//        方法体：对每一个数据的处理操作
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        list.stream().forEach(s -> System.out.println(s));

//        long count()                            统计
//        long count = list.stream().count();
//        System.out.println(count);

//        toArray()                               收集流中的数据，放到数组中
//        Object[] objects = list.stream().toArray();
//        System.out.println(Arrays.toString(objects));
        //IntFunction具体类型的数组
        //apply的形参:流中数据的个数，要和数组保持一致
        //apply的返回值：具体的数据类型
        //方法体：创建数组


        //toArrly方法的作用：负责一个制定类型的数组
        //toArrly方法的底层：会依次得到流里面的每一个数据，并把数据存到数组中
        //toArrly方法的返回值:是一个装着流里面所有数据的数组

//        String[] strings = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(strings));
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
