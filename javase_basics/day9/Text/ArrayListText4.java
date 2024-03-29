package itheima.day9.Text;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;

public class ArrayListText4 {
      /*
        需求: 创建一个存储String的集合,内部存储（day2.test,张三,李四,day2.test,day2.test）字符串
                删除所有的test字符串,删除后,将集合剩余元素打印在控制台

                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i);
                    if("day2.test".equals(s)){
                        list.remove(i);
                        i--;
                    }
                }

        总结: 在遍历集合的过程中, 有删除操作
                    1. 正序遍历 : 不要忘记 --操作
                    2. 倒序遍历 : 不需要  --操作
     */
      public static void main(String[] args) {
          ArrayList<String> list= new ArrayList<>();
          list.add("text");
          list.add("张三");
          list.add("李四");
          list.add("text");
          list.add("text");
          for (int i = 0; i < list.size(); i++) {
              String s = list.get(i);
              if("text".equals(s)){
                  list.remove(i);
                  i--;
              }
          }
          System.out.println(list);
      }
}
