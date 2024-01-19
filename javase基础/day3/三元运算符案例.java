package itheima.day3;
//需求，键盘录入三个整数，求出最大的一个数，并打印在控制台
//&&的优先级高于||
import java.util.Scanner;
public class 三元运算符案例 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数的整数");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();
         int tempMax = num1>num2?num1:num2;
         int MAX = tempMax>num3?tempMax:num3;
        System.out.println("最大的值时"+MAX);
    }
}