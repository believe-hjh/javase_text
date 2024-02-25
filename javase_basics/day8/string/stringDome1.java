package itheima.day8.string;
import java.util.Scanner;
public class stringDome1 {
    public static void main(String[]agrs) {
        Scanner sc =new Scanner(System.in);
        String  user="admin";
        String password ="123456";
        System.out.println("请输入用户名");
        String getuser =sc.nextLine();
        System.out.println("请输入密码");
        String getpassword =sc.nextLine();
        if(user.equals(getuser)&&password.equals(getpassword)){
            System.out.println("登录成功");
        }
        else{
            System.out.println("登录失败");
        }

    }
}
