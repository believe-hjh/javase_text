package itheima.day3;
/*
关系型运算符：
>
>=
<
<=
==
!=
& 与
| 或
! 非
^ 异或  相同为false 不同为true
短路逻辑运算符：
&：无论左边时True还是flase，右边都执行
&& ：具有短路效果，左边为false，停止执行
                左边为Turn，继续执行
|：无论左边时True还是flase，右边都执行
||：具有短路效果，左边为true，停止执行
                左边为false，继续执行
*/
public class 关系型运算符 {
    public static void main(String[] args) {
        System.out.println(10>20);
        System.out.println(10>=20);
        System.out.println(10<20);
        System.out.println(10<=20);
        System.out.println(10==20);
        System.out.println(10!=20);
    }
}
