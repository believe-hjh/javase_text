package day9.com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("眼瞅着你不是真正的高兴");
        list.add("温油");
        list.add("离开俺们这旮表面");
        list.add("伤心的人别扭秧歌");
        list.add("私奔到东北");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            if("温油".equals(next)){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
