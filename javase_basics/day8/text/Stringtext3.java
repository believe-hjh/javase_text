package itheima.day8.text;

import java.util.Scanner;

public class Stringtext3 {
    /*
        需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
                最终效果为：156****1234

        分析:
                1. 键盘录入字符串
                2. 截取前三位
                3. 截取后四位
                4. 前三位 + "****" + 后四位
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String start = s.substring(0, 3);
        String end= s.substring(7);
        System.out.println(start+"****"+end);
    }
}
