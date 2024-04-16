package day11.com.itheima.maptest;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
      /*
            V put(K key,V value)                    添加元素
            V remove(Object key)                    根据键删除键值对元素
            void clear()                            移除所有的键值对元素
            boolean containsKey(Object key)         判断集合是否包含指定的键
            boolean containsValue(Object value)     判断集合是否包含指定的值
            boolean isEmpty()                       判断集合是否为空
            int size()                              集合的长度，也就是集合中键值对的个数
        */

    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("张三","sa");
        m.put("李四","cc");
        m.put("王五","bb");

        System.out.println(m);

//        m.remove("张三");
//
//        System.out.println(m);
//        m.clear();
//        System.out.println(m);
        m.containsKey("张三");



    }
}
