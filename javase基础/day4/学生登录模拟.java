package itheima.day4;

import java.util.Scanner;
/*
        continue : 跳过

        注意事项 : continue只能在循环中使用

        -------------------------------------

        break, continue的共同注意事项 :

                下面不允许写代码, 因为执行不到, 属于无效的代码.
     */

public class 学生登录模拟 {
    public static void main(String[] args) {
        lgain();

    }

    public static void lgain(){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=1;i<=3;i++){System.out.println("请输入密码");
            int a =sc.nextInt();
            if (a == 123456){
                System.out.println("密码输入正确");

            break;}
            else{
                System.out.println("输入错误");
            }

        }
    }
}
