package itheima.day8.text;

import java.util.Scanner;

public class Stringtext2 {
    /*
       需求 : 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
               (不考虑其他字符)

               例如 :  aAb3&c2B*4CD1

               小写字母 : 3个
               大写字母 : 4个
               数字字母 : 4个
    */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(i);
            if(c1>='a'&&c1<='z'){
                a+=1;
            }else if (c1>='A'&&c1 <='Z'){
                b+=1;
            }
            else if(c1>='0'&&c1<='9'){
                c+=1;
            }

        }
        System.out.println("大写字母"+a+"个");
        System.out.println("小写字母"+b+"个");
        System.out.println("数字字母"+c+"个");
    }

    private static void extracted() {
        char c = '0';
        if(c>='a'&&c<='c'){
            System.out.println("这是个小写字母");
            }
        else if(c>='A'&&c<='C'){
            System.out.println("这是个大写字母");
        }else if(c>='0'&&c<='9'){
            System.out.println("这是个数字");
        }
    }

}
