package itheima.day2;
import java.util.Scanner;
/*
        Scanner键盘录入的三个步骤

            1. 找符咒
                        代码: import java.util.Scanner;
                        位置: class的上面
                        含义: 能够让自己的类ScannerDemo, 从代码仓库中, 找到Scanner符咒
            2. 召唤精灵
                        代码: Scanner sc = new Scanner(System.in);
                        位置: main方法里面
                        含义: 从符咒中召唤精灵, 给精灵起名字叫做 sc

            3. 指挥精灵干活

                        代码:
                                int age = sc.nextInt();             从键盘录入整数, 并使用int类型变量接收
                                double height = sc.nextDouble();    从键盘录入小数, 并使用double类型变量接收
                                boolean flag  = sc.nextBoolean();   从键盘录入布尔, 并使用boolean类型变量接收
                                String name = sc.next();            从键盘录入字符串, 并使用String类型变量接收
     */
public class 键盘录入 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("请输入一个小数");
        double heima =sc.nextDouble();
        System.out.println(heima);
        System.out.println("请输入一个布尔值");
        boolean hu = sc.nextBoolean();
        System.out.println(hu);
        System.out.println("请输入一个字符串");
        String abc = sc.next();
        System.out.println(abc);
    }
}
