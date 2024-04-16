package day10.com.itheima.set;

import java.util.TreeSet;

public class TreesetDome1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("c");
        ts.add("d");
        ts.add("a");
        ts.add("a");
        ts.add("c");
        ts.add("g");
        ts.add("h");
        System.out.println(ts);
    }
}
