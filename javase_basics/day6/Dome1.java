package itheima.day6;
/*
        思路: 今后只要涉及到数据交换, 联想到第三方的变量

                int a = 10;
                int b = 20;

                int c = a;
                a = b;
                b = c;

                System.out.println("a=" + a);   // 20
                System.out.println("b=" + b);   // 10

        面试题: 实现两个变量的数据交换, 不允许定义第三方变量
     */

/*
    ^ 异或 :

            特点:
                    1. 相同为false, 不同为true
                    2. 一个数字, 被另外一个数字异或两次, 该数本身不变

    异或操作数值的运算过程 :

        1. 将需要运算的数据, 转换为二进制数据

                0000 1010       10
                0000 0101       5

        2. 将二进制数据的0当做为false, 1当做为true, 运算

                0000 1010
            ^   0000 0101
        --------------------
                0000 1111

        3. 将运算后的二进制数据, 转换为十进制
 */
public class Dome1 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        a = a^b;
        b= a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }



}
