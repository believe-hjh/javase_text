package itheima.day6;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
    int[] arr = {19, 28, 37, 46, 50};
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你要查找的数字");
        int sum = sc.nextInt();
        int arr1 = getArr(sum,arr);
        System.out.println(arr1);
    }
     /*
        需求:
            设计一个方法, 查找元素在数组中的索引位置

            查找元素, 在数组中第一次出现的索引位置.

            已知一个数组 arr = {19, 28, 37, 46, 50};
            键盘录入一个数据，查找该数据在数组中的索引。
            并在控制台输出找到的索引值。
            如果没有查找到，则输出-1
     */

    public static int getArr(int sum,int arr[]){
        int len =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sum){
                len =i;
                break;
            }


        }
        return len;
    }

}
