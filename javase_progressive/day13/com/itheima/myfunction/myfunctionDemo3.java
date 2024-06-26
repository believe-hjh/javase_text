package day13.com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class myfunctionDemo3 {
     /*
        方法引用（引用成员方法）
        格式
                其他类：其他类对象::方法名
                本类：this::方法名(引用处不能是静态方法)
                父类：super::方法名(引用处不能是静态方法)
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，而且名字是3个字的

       */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));


//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张")&& s.length()==3;
//            }
//        }).forEach(s -> System.out.println(s));
        StringOperation stringOperation = new StringOperation();
        list.stream().filter(stringOperation::stringJudge)
                .forEach(s -> System.out.println(s));
    }
}
