package itheima.day3;
/*
    赋值运算符：
        1.基本运算符：
        = 含义：将等号右边的值赋值给左边
        2.扩展赋值运算符：
        +=  将符号两边的数值做加法运算,并将值赋值给左边
        -=  将符号两边的数值做减法运算,并将值赋值给左边
        *=  将符号两边的数值做乘法运算,并将值赋值给左边
        /=  将符号两边的数值做除法运算,并将值赋值给左边
        %=  将符号两边的数值做取余运算,并将值赋值给左边
        细节补充：
            在使用扩展赋值运算符时，内部自带强转效果
        */

public class 赋值运算符 {
    public static void main(String[] args) {
        int a =10;
        a+=20;
        System.out.println(a);

    }
}
