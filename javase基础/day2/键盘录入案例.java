package itheima.day2;
import java.util.Scanner;
public class 键盘录入案例 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String abc =sc.next();
        System.out.println("请输入您的年龄");
        int a =sc.nextInt();
        System.out.println("请输入您的性别");
        String eee = sc.next();
        System.out.println("请输入您的身高");
        double sss=sc.nextDouble();
        System.out.println("请输入您的婚烟状况");
        boolean qwe =sc.nextBoolean();
    }
}
