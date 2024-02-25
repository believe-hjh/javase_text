package itheima.day5;

public class 数组常见问题 {
    /*
       数组索引越界异常 : ArrayIndexOutOfBoundsException

       原因: 访问了不存在的索引
    */
    public static void main(String[] args) {
        int[]arrly = {11,22,33,44};
        System.out.println(arrly[9]);
    }
}
