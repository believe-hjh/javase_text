package day13.com.itheima.mystream;

import java.util.Arrays;

public class mystreamDemo4 {
    //数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        String str[] = {"a","b","c","d","e","f"};

        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("================================");
        Arrays.stream(str).forEach(s -> System.out.println(s));
    }
}
