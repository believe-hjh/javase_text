package itheima.day6;

import java.util.Scanner;
/*
       需求:
             在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
             选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值

             1. 基本实现 (不考虑分数校验)
             2. 校验键盘录入的分数是否是0~100之间
             3. 抽取方法
    */
public class text6 {
    public static void main(String[] args) {
        int[] arr = getInts();
        int sum = getSum(arr);
        //求最大值
        int max = getMax(arr);
        //求最小值
        int min = getMin(arr);
        //算平均值
        double count =1.0*((sum-max-min))/(arr.length-2);
        System.out.println(count);

    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min> arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum=0;
        //求和
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }

    private static int[] getInts() {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入6位选手的分数");
        int[]arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"位选手的分数");
            int scaer=sc.nextInt();
            if(scaer>0&scaer<100){
                arr[i]=scaer;
            }else {
                System.out.println("你输入的成绩有误，请重新输入");
                i--;
            }
        }
        return arr;
    }

}
