package itheima.day5;

public class 二维数组 {
    /*
      二维数组的遍历操作

              1. 遍历二维数组, 获取到每一个一维数组
              2. 继续遍历一维数组, 获取到具体的元素
   */
    public static void main(String[] args) {
        //erweiDome();
        int[][]arr={{33,44,55},{11,22,33}};
        every(arr);
        int sum=getSum(arr);
        System.out.println("这些数字的和是"+sum);
    }
    //二维数组遍历
    public static void erweiDome(){
        int[][]arrly = {
                {11,22,33},
                {33,44,55}
        };
        System.out.println(arrly[0] [0]);
        System.out.println(arrly[1][2]);
    }
    //练习
    /**
     * 遍历并打印二维数组中元素
     * 已知一个二维数组 arr = { {11 , 22 , 33} , {33 , 44 , 55} };
     * 遍历该数组，取出所有元素并打印
     */
    public static void every(int[][]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    /**
     * 遍历二维数组并求和
     * 已知一个二维数组 arr = { {11 , 22 , 33} , {33 , 44 , 55} };
     * 对内部存储的元素累加求和，并将结果输出在控制台
     */
    public static int getSum(int[][]arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
