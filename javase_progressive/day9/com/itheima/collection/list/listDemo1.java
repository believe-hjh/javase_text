package day9.com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
        /*
        List接口的特点 : 存取有序, 有索引, 可以存储重复的

        和索引有关的API :

            public void add(int index, E element) : 在指定的索引位置, 添加元素
            public E remove(int index) : 根据索引删除集合中的元素
            public E set(int index, E element) : 根据索引修改集合中的元素
            public E get(int index) : 返回指定索引处的元素
     */
        public static void main(String[] args) {
                List<String> list = new ArrayList<>();
                list.add("aaa");
                list.add("bbb");
                list.add("ccc");
                list.add(0,"赵六");
                for (int i = 0; i < list.size(); i++) {
                        String s = list.get(i);
                        System.out.println(s);
                }
        }
}
