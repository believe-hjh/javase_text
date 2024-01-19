package itheima.day6;

public class Dome2 {
    /*
        已知一个数组 arr = {11, 22, 33, 44, 55}; 用程序实现把数组中的元素值交换，
        交换后的数组 arr = {55, 44, 33, 22, 11}; 并在控制台输出交换后的数组元素。

        1. 确定好谁跟谁换

                第一个和倒数第一个 :  arr[0]  arr[arr.length-1-0]
                第二个和倒数第二个 :  arr[1]  arr[arr.length-1-1]
                第三个和倒数第三个 :  arr[2]  arr[arr.length-1-2]
                ...

                arr[i]  arr[arr.length-1-i]

        2. 定义三方变量, 套入公式
     */

    public static void main(String[] args) {
        int[]arr={11,22,33,44,55};

        arr2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void arr2(int[] arr) {
        for(int start = 0, end = arr.length-1; start<end; start++,end--){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end ]=temp;
        }
    }

    private static void arrly1(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
    }

}
