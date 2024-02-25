package itheima.day8.text;

import java.util.Scanner;

public class text1 {
    /*
        需求: 模拟用户登录, 一共三次机会, 登录之后要给出相应的提示

        分析:
                1. 定义两个字符串类型变量, 模拟已经存在的用户名和密码
                2. 键盘录入用户输入的用户名, 密码
                3. 比对
     */
    public static void main(String[] args) {
        String uaser = "itheima";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String usaerDome = sc.nextLine();
            System.out.println("请输入密码");
            String passwordDome = sc.nextLine();
            if (usaerDome.equals(uaser) && password.equals(passwordDome)) {
                System.out.println("登录成功");
                break;
            } else {

                if(i==3){
                    System.out.println("您今天的登陆机会已经用完了");
                }else {
                    System.out.println("登录失败,您还剩"+(3-i)+"次机会");
                }
            }
        }
    }
}
