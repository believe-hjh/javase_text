package itheima.day8;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class ScannerD {
    /*
       Scanner键盘录入字符串 :

           String next() : 遇到了空格, 或者是tab键就不再录入了
           String nextLine() : 以回车作为录入的结束标记

           弊端:
                   1. next() : 数据可能录入不完整
                   2. nextLine() : 之前调用过nextInt(), nextDouble(), nextFloat()...
                                       nextLine()方法, 就不干活了

           解决方案: 不用解决
                           Scanner : 采集用户信息 (只在学习过程用的到)

           目前的使用方案:
                           需求如果要键盘录入字符串
                                   如果所有的数据, 全部都是字符串, 直接nextLine();
                                           举例:
                                                   键盘录入用户名, 键盘录入用户密码

                                   如果数据除了字符串, 还有其他类型, 需要调用next()方法
                                           举例:
                                                   键盘录入用户名, 键盘录入用户年龄, 用户身高

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String a = sc.nextLine();
        System.out.println(a);
        System.out.println("请输入密码");
        String b  = sc.nextLine();
        System.out.println(b);
    }
}
