package itheima.day5;

import java.util.Random;
import java.util.Scanner;

 /*
        数组两种初始化的区别 :

            动态初始化: 手动指定长度, 系统分配默认初始化值
            静态初始化: 手动指定元素, 系统会根据元素的个数, 计算出数组的长度

        两种初始化的使用选择 :

            1. 静态初始化: 如果要操作的数据, 需求中已经明确给出了, 直接静态初始化
                            需求: 已知班级学生成绩为 100 100 90 20 100, 找出最高分
                            int[] arr = {100,100,90,20,100};

            2. 动态初始化: 只明确元素个数, 不明确具体数值
                            需求1: 键盘录入5个学生成绩, 找出最高分
                            需求2: 产生10个1~100之间的随机数, 找出最小值

  */
 public class 两种初始化的区别 {
     public static void main(String[] args) {
//         int [] newarr =sum();
//         int max = getmax(newarr);
//         System.out.println("最高分为"+max);
         int []newrandome = ranDome();
         int min =getMin(newrandome);
         System.out.println("最小的数是"+min);
     }
     //需求1
     public static int[] sum(){
         Scanner sc = new Scanner(System.in);
         int []arr = new int[5];
         System.out.println("请输入5名学生的成绩");
         for (int i = 0; i < arr.length; i++) {
             System.out.println("现在输入第"+(i+1)+"名学生的成绩");
             arr[i]=sc.nextInt();


         }
         return arr;
     }
     //需求2
     public static int[] ranDome(){
         Random r = new Random();
         int[]random = new int[10];
         for (int i = 0; i < random.length; i++) {
             random[i]=r.nextInt(100)+1;
             System.out.println("第"+(i+1)+"个数是"+random[i]);

         }
         return random ;
     }
     //求最大值
     public static int getmax(int[]arr) {
         int max= arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(max<arr[i]){
                 max =arr[i];
             }
         }
         return max;

     }
     //求最小值
     public static int getMin(int []arr){
         int min= arr[0];
         for (int i = 0; i < arr.length; i++) {
             if(min>arr[i]){
                 min =arr[i];
             }
         }
         return min;
     }
 }

