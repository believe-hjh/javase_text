package itheima.day4;

import java.util.Scanner;
import java.util.WeakHashMap;

public class 死循环案例 {
    public static void main(String[] args) {
        Dome();
    }

    public static void Dome(){
        Scanner sc = new Scanner(System.in);
        int scnner;
        while (true){
            System.out.println("请输入你的选择：1.增加学生信息,2.删除学生信息;3.修改学生信息,4.查看学生信息,5.退出");
            scnner = sc.nextInt();
            switch (scnner){
                case 1:
                    System.out.println("增加学生信息执行中...");
                    break;
                case 2:
                    System.out.println("删除学生信息执行中...");
                    break;
                case 3:
                    System.out.println("修改学生信息执行中...");
                    break;
                case 4:
                    System.out.println("查看学生信息执行中...");
                    break;
                case 5:
                    System.out.println("感谢使用，再见");
                    return; // 退出方法，结束程序
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }
}
