package day5.integer;

public class IntegerTest {
    /*
        已知字符串 String s = "10,50,30,20,40";
        请将该字符串转换为整数并存入数组
        随后求出最大值打印在控制台
     */
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        // 1. 根据逗号做切割
        String[] split = s.split(",");

        // 2. 准备一个整数数组, 准备存储转换后的数字
        int [] num = new int[split.length];

        // 3. 遍历字符串数组
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(split[i]);
        }

        // 5. 求最大值
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max){
                max =num[i];
            }
        }
        System.out.println("最大数为"+max);


    }
}
