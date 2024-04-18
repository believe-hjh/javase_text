package day13.com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class myfunctionDemo7 {
    public static void main(String[] args) {
          /*
        需求：
             集合中存储一些字符串的数据，比如：张三,23。
             收集到Student类型的数组当中
       */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        String[] strings = list.stream().map(String::new).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
