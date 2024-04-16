package day9.com.itheima.collection;



import day9.com.itheima.domin.student;

import java.util.ArrayList;
import java.util.Collection;

public class collectionTest {
      /*
        Collection的常用方法 :

            public boolean add(E e) : 把给定的对象添加到当前集合中
            public void clear() : 清空集合中所有的元素
            public boolean isEmpty() : 判断当前集合是否为空
            public boolean remove(E e) : 把给定的对象在当前集合中删除
            public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
            public int size() : 返回集合中元素的个数(集合的长度)
     */
      public static void main(String[] args) {
          Collection<student> s = new ArrayList<>();
          s.add(new student("张三",23));
          s.add(new student("李四",24));
          s.add(new student("王五",25));
          System.out.println(s);
          s.remove(new student("李四",24));
          System.out.println(s);
      }

    private static void method() {
        Collection<String> c = new ArrayList<>();
        boolean b1 = c.add("张三");
        boolean b2 = c.add("李四");
        boolean b3 = c.add("王五");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c);

        // c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());


        boolean b = c.remove("李四");
        System.out.println(c);


        boolean a= c.contains("张三");
        System.out.println(a);

        int i = c.size();
        System.out.println(i);
    }
}
