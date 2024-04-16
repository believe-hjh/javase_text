package javase_progressive.day8.recursion;

public class RecursionDemo4 {
    public static void main(String[] args) {
        System.out.println(monkey(1));
    }

    public static int monkey(int num) {
        if (num == 10) {
            return 1;
        } else {
            // 公式 : (后一天的桃子数量 + 1) * 2;
            return (monkey(num + 1) + 1) * 2;
        }
    }

}
