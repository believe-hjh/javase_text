package itheima.day5;

public class 数组动态初始化 {
    public static void main(String[] args) {
        kail();
    }
    /*
        数组的动态初始化 :

            在初始化的时候, 只需要指定数组的长度, 系统就会分配默认值(初始值)

            格式: 数据类型[] 数组名 = new 数据类型[长度];

            默认值的分类 :

                    整数 : 0
                    小数 : 0.0
                    布尔 : false
                    ---------------------------
                    字符 : '\u0000'       ---> Unicode字符  ---> 常见的体现是空白字符
                    引用数据类型 : null

                    引用数据类型 : 数组, 类, 接口

                    String : 类
     */
    public static void kail(){
        int [] sum = new int[3];
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }

    }
}
