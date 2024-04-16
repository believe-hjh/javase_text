package day9.com.itheima.collection;

import day9.com.itheima.domin.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class collectionTest2 {
     /*
        public Iterator<E> iterator() : 获取遍历集合的迭代器
        public E next() : 从集合中获取一个元素
        public boolean hasNext() : 如果仍有元素可以迭代，则返回 true

        注意: 如果next()方法调用次数过多, 会出现NoSuchElementException
     */
    public static void main(String[] args) {
        Collection<student> c = new ArrayList<>();
        c.add(new student("张三",23));
        c.add(new student("李四",24));
        c.add(new student("王五",25));
        Collection<String> s = new ArrayList<>();
        s.add("abc");
        s.add("ccc");
        s.add("ccc");
        s.add("aaa");
        //1.获取迭代器
        Iterator<student> it = c.iterator();
        //通过循环判断所需元素是否存在
        while (it.hasNext()){
            student stu = it.next();
            System.out.println(stu.getName()+"-----------"+stu.getAge());
        }
        System.out.println("---------------------------------------");
        //使用增强for循环，遍历集合
        for(student stu:c){
            System.out.println(stu);
        }
        //foreach方法遍历集合
        c.forEach(student -> System.out.println(student));

        // foreach方法遍历集合
        c.forEach(stu -> System.out.println(stu));


    }

}
