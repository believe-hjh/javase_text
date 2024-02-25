package itheima.day5;

public class 数组内存_2 {
    /*
       方法的参数传递问题 :

           1. 基本数据类型: 传递的是数据值
           2. 引用数据类型: 传递的是地址值

           问题: Java到底是值传递, 还是址传递?
           回答: 值传递, 地址值也是值
    */
    public static void main(String[] args) {
        int[]a={11,22,33,44};
        System.out.println("调用charge方法前"+a[2]);
        Dome(a);
        System.out.println("调用charge方法后"+a[2]);
    }

    public static void Dome(int[]a) {
    a[2]=66;
    }
}
