package day11.com.itheima.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maptest2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("我是","小黑子");
        map.put("只因","你太美");
        map.put("鸡你","太美");

        Set<String> keys = map.keySet();



        for(String key : keys){
//            System.out.println(key);

            String s = map.get(key);


            System.out.println(key +"---"+s);
        }

    }
}
