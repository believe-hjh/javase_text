package day13.com.itheima.mystream;

import java.util.stream.Stream;

public class mystreamDemo5 {
    // 一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        System.out.println("=================================");
        Stream.of("a","b","c","d").forEach(s -> System.out.println(s));
    }
}
