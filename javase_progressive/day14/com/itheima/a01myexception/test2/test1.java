package day14.com.itheima.a01myexception.test2;

import java.util.Scanner;

public class test1 {
    /*
          需求：
              键盘录入自己心仪的女朋友姓名和年龄。
              姓名的长度在 3 - 10之间，
              年龄的范围为 18 - 40岁,
              超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
          提示：
              需要考虑用户在键盘录入时的所有情况。
              比如：录入年龄时超出范围，录入年龄时录入了abc等情况
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                System.out.println("录入自己心仪的女朋友姓名");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("键盘录入自己心仪的女朋友年龄");
                int age = sc.nextInt();
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
               e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            }catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(gf);
    }
}
