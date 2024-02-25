package day5.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
        BigDecimal类 : 解决小数运算中, 出现的不精确问题

        BigDecimal创建对象 :

                public BigDecimal(double val) : 不推荐, 无法保证小数运算的精确
                ---------------------------------------------------------------
                public BigDecimal(String val)
                public static BigDecimal valueOf(double val)

        BigDecimal常用成员方法 :

                public BigDecimal add(BigDecimal b) : 加法
                public BigDecimal subtract(BigDecimal b) : 减法
                public BigDecimal multiply(BigDecimal b) : 乘法
                public BigDecimal divide(BigDecimal b) : 除法
                public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) : 除法

        注意: 如果使用BigDecimal运算, 出现了除不尽的情况, 就会出现异常
     */
    public static void main(String[] args) {

    BigDecimal bd1 = new BigDecimal(10.0);
    BigDecimal bd2 = new BigDecimal(3.3);
        System.out.println(bd1.divide(bd2, 2, RoundingMode.UP));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.DOWN));
        BigDecimal reason = bd1.add(bd2);
        double v = reason.doubleValue();
        System.out.println(v);
    }

    private static void extracted() {
        BigDecimal bigDecimal = BigDecimal.valueOf(0.5);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.5);
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1));
    }


}
