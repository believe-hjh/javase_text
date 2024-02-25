package itheima.day5;

public class 二位数组动态初始化 {
    public static void main(String[] args) {
        int [] arr1={11,22,33};
        int[]  arr2={33,44,55};
        int[][]arrly=new int[2][3];
        arrly[0]=arr1;
        arrly[1]=arr2;
        for (int i = 0; i < arrly.length; i++) {
            for (int j = 0; j < arrly[i].length; j++) {
                System.out.println(arrly[i][j]);
            }
        }
    }


}
