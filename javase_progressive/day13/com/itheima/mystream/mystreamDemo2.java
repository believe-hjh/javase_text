package day13.com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class mystreamDemo2 {
    /*
        单列集合      default Stream<E> stream()                           Collection中的默认方法
        双列集合      无                                                   无法直接使用stream流
        数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
        一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
*/

    public static void main(String[] args) {
        //1.创建单列集合
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"a","b","c","d","f","g");
//        //2.获取流水线
//        Stream<String> stream = arrayList.stream();
//        //3.使用终结方法打印下流水线的所有数据
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        arrayList.stream().forEach(s -> System.out.println(s));
    }
}
