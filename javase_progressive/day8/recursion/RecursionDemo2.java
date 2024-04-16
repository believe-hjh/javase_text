package javase_progressive.day8.recursion;

public class RecursionDemo2 {
    /*
        需求: 使用递归求5的阶乘
     */
    public static void main(String[] args) {

        int result = jc(5);
        System.out.println(result);

        int sum = getSum(5);
        System.out.println(sum);

    }

    public static int jc(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * jc(num - 1);
        }
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n += getSum(n - 1);
        }
    }
}
