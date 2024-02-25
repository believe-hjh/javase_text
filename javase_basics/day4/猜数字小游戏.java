package itheima.day4;

import java.util.Random;
import java.util.Scanner;

public class 猜数字小游戏 {
    public static void main(String[] args) {
        Dome();

    }
    public static void Dome(){
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        int randomDome = r.nextInt(100)+1;
        System.out.println(randomDome);
        while(true){
            int scnnerDome = sc.nextInt();
            if(randomDome<scnnerDome){
                System.out.println("猜大了");
            }else if (randomDome>scnnerDome){
                System.out.println("猜小了");
            }
            else {
                System.out.println("回答正确");
                break;
            }
        }
        System.out.println("恭喜");
    }
}
