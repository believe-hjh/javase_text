package day13.com.itheima.mystream;

import java.util.HashMap;
import java.util.Map;

public class mystreamDemo3 {
    //双列集合      无       无法直接使用stream流
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("111","aaa");
        map.put("222","bbb");
        map.put("333","ccc");
        map.put("444","ddd");
        //第一种方式获取stream流
        map.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------------");
        //第二中方式获取streamliu
        map.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
